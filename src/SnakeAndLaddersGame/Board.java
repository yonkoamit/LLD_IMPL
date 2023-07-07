package SnakeAndLaddersGame;

public class Board {
    Cell[][] cells;

    Board(int boardSize,int snakes,int ladders)
    {
        initializeCells(boardSize);
        addSnakesAndLadders(snakes,ladders);
    }

    public void initializeCells(int boardSize){
        cells=new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++)
        {
            for(int j=0;j<boardSize;j++)
            {
                cells[i][j]=new Cell();
            }
        }
    }

    public void addSnakesAndLadders(int snakes,int ladders){

        while (snakes>0)
        {
            int snakeStart= 1+(int)(Math.random()*(cells.length* cells.length-1));
            int snakeEnd= 1+(int)(Math.random()*(cells.length* cells.length-1));

            if(snakeEnd>=snakeStart) continue;

            Jump snakeObj=new Jump();
            snakeObj.start=snakeStart;
            snakeObj.end=snakeEnd;
            Cell cell= getCell(snakeStart);
            cell.jump=snakeObj;
            snakes--;
        }

        while (ladders>0)
        {
            int ladderStart= 1+(int)(Math.random()*(cells.length* cells.length-1));
            int ladderEnd= 1+(int)(Math.random()*(cells.length* cells.length-1));

            if(ladderStart>=ladderEnd) continue;

            Jump ladderObj=new Jump();
            ladderObj.start=ladderStart;
            ladderObj.end=ladderEnd;
            Cell cell= getCell(ladderStart);
            cell.jump=ladderObj;
            ladders--;
        }

    }

    public Cell getCell(int position)
    {
        int row=position/cells.length;
        int col=position% cells.length;
        return cells[row][col];
    }


}
