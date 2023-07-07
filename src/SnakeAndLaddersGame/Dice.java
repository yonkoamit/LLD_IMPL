package SnakeAndLaddersGame;

public class Dice {
    int diceCount;
    int minValue=1;
    int maxValue=6;

    public Dice(int diceCount){
        this.diceCount=diceCount;
    }
    public int rollDice(){
        int totalSum=0;
        int diceUsed=0;
        while(diceUsed<diceCount){
            totalSum+=minValue+(int)(Math.random()*(maxValue-minValue+1));
            diceUsed++;
        }
        return totalSum;
    }

}
