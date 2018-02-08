package wormgame.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.security.Key;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import wormgame.domain.Worm;
import wormgame.game.WormGame;

public class UserInterface implements Runnable {

    private JFrame frame;
    private WormGame game;
    private int sideLength;
    private DrawingBoard drawingBoard;

    public UserInterface(WormGame game, int sideLength) {
        this.game = game;
        this.sideLength = sideLength;

    }

    // Getters
    public Updatable getUpdatable() {
        return this.drawingBoard;
    }

    public void setUpdatable(DrawingBoard drawingBoard) {
        this.drawingBoard = drawingBoard;
    }

    public JFrame getFrame() {
        return frame;
    }

    @Override
    public void run() {
        frame = new JFrame("Worm Game");
        int width = (game.getWidth() + 1) * sideLength + 10;
        int height = (game.getHeight() + 2) * sideLength + 10;

        //int width = (game.getWidth());
        //int height = (game.getHeight());

        frame.setPreferredSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        // Create drawing board first which then is added into container-object.
        // After this, create keyboard listener which is added into frame-object
        drawingBoard = new DrawingBoard(game, sideLength);
        //game.setUpdatable(drawingBoard); // added this line 8.feb.18

        container.add(drawingBoard);

        frame.addKeyListener(new KeyboardListener(this.game.getWorm()));
    }

}
