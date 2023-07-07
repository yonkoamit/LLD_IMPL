package SnakeAndLaddersGame;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    Board board;
    Dice dice;
    Queue<Player> players= new LinkedList<Player>();
    Player winner;

    Game(){
        initializeGame();
    }

    public void initializeGame(){
        dice =new Dice(1);
        winner=null;
        addPlayers();
        board=new Board(10,5,4);

    }

    public void addPlayers(){
        players.add(new Player("1",0));
        players.add(new Player("2",0));
    }

    public void startGame(){
        while(winner==null){
            Player player=getPlayer();
            System.out.println("Player turn is "+ player.id+" current position is" + player.currentPosition);
            int diceNumber= dice.rollDice();
            int playerNewPosition= player.currentPosition+diceNumber;
            playerNewPosition=jumpCheck(playerNewPosition);
            player.currentPosition=playerNewPosition;

            System.out.println("Player turn is "+ player.id+" new position is" + player.currentPosition);

            if(playerNewPosition>=(board.cells.length*board.cells.length)){
                winner=player;
            }

        }

        System.out.println("winner is "+winner.id);
    }

    private Player getPlayer(){
        Player player= players.remove();
        players.add(player);
        return player;
    }

    private int jumpCheck(int position){
        if(position>board.cells.length*board.cells.length-1){
            return position;
        }

        Cell cell= board.getCell(position);
        if(cell.jump!=null && cell.jump.start==position){
            String jumpBy=(cell.jump.end>cell.jump.start) ? "Ladder":"Snake";
            System.out.println("Jump Done by "+ jumpBy);
            return cell.jump.end;
        }

        return position;



    }
}
