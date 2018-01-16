package dungeon;

public class Player{

    private boolean isAlive;
    private int lampCharge;
    private int xCoord;
    private int yCoord;

    public Player(int lampCharge) {
        this.isAlive = true;
        this.lampCharge = lampCharge;
        this.xCoord = 0;
        this.yCoord = 0;

    }


    // Getters and Setters
    public boolean isAlive() {
        return isAlive;
    }

    public int getLampCharge() {
        return lampCharge;
    }

    public int getX() {
        return xCoord;
    }

    public int getY() {
        return yCoord;
    }

    public boolean getAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setLampCharge(int lampCharge) {
        this.lampCharge = lampCharge;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }
}
