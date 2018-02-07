package wormgame.domain;

public class Piece {

    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public boolean runsInto(Piece piece) {

        if (this.x == piece.getX() && this.y == piece.getY()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
