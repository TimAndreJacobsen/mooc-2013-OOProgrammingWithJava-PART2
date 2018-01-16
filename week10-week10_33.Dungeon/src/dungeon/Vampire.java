package dungeon;

import java.util.Random;

public class Vampire {

    private boolean isAlive;
    private int xCoord;
    private int yCoord;

    public Vampire(String[][] gameBoard, Dungeon dungeon) {

        Random rand = new Random();
        this.isAlive = true;

        this.xCoord = rand.nextInt(gameBoard.length);
        this.yCoord = rand.nextInt(gameBoard[0].length);

        if (gameBoard[xCoord][yCoord].contains(".")) {
            gameBoard[xCoord][yCoord] = "v";
            dungeon.getVampireArrayList().add(this);
            System.out.println("Added vampire to list");
        }


    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getX() {
        return xCoord;
    }

    public int getY() {
        return yCoord;
    }
}
