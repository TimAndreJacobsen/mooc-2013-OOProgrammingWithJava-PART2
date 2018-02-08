package wormgame.gui;

import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel implements Updatable {

    private int pieceLength;
    private WormGame wormGame;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        this.wormGame = wormGame;
        this.pieceLength = pieceLength; // Size of either height / length

    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        for (Piece p : this.wormGame.getWorm().getPieces() ) {
            graphics.setColor(Color.BLACK);
            graphics.fill3DRect(p.getX(),p.getY(),pieceLength,pieceLength,true);
        }
        graphics.setColor(Color.RED);
        graphics.fillOval(wormGame.getApple().getX(), wormGame.getApple().getY(), pieceLength, pieceLength);



    }

    @Override
    public void update() {
        super.repaint();
            }
}
