package wormgame.domain;

import wormgame.Direction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Worm {
    // Declaring class variables
    private int x;
    private int y;
    private boolean grow;

    private Direction direction;
    private List<Piece> body;

    // Constructor
    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        this.body = new ArrayList<Piece>();
        this.body.add(new Piece(x,y));
        this.grow = false;
    }

    // Getters and Setters
    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return this.body.size();
    }

    public List<Piece> getPieces() {
        return this.body;
    }

    // Class Methods
    public void move() {

        if (this.direction == Direction.UP) {
            body.add(new Piece(this.x, this.y-1));
            this.y = this.y -1;

        } else if (this.direction == Direction.DOWN) {
            body.add(new Piece(this.x, this.y+1));
            this.y = this.y +1;

        } else if (this.direction == Direction.LEFT) {
            body.add(new Piece(this.x-1, this.y));
            this.x = this.x -1;

        } else if (this.direction == Direction.RIGHT) {
            body.add(new Piece(this.x+1, this.y));
            this.x = this.x +1;
        }
        if (this.getLength() > 3 && grow == false) {
            body.remove(0);
        }
        if (grow == true) {
            grow = false;
        }
    }

    public void grow() {
        grow = true;
    }

    public boolean runsInto(Piece piece) {

        for (Piece bodyPiece : body) {
            if (piece.getX() == bodyPiece.getX() && piece.getY() == bodyPiece.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (int i = 0; i < getLength()-1; i++) {
            if (body.get(body.size()-1).getX() == body.get(i).getX() && body.get(body.size()-1).getY() == body.get(i).getY()) {
                return true;
            }
        }
        return false;
    }


}