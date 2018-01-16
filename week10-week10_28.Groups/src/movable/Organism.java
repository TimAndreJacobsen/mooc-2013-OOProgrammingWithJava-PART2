package movable;

public class Organism implements Movable {
    // Declarations
    private int xCoord;
    private int yCoord;

    // Constructor (Initializes the declared variables)
    public Organism(int xCoord, int yCoord) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    @Override // Inherited Method Override from Interface Object
    public String toString() {
        return "x: " + this.xCoord + "; y: " + this.yCoord;
    }

    @Override // Inherited Method Override from Interface Movable
    public void move(int dx, int dy) {

        this.xCoord += dx;
        this.yCoord += dy;
    }

}
