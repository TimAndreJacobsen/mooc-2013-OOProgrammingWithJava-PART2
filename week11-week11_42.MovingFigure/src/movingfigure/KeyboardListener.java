package movingfigure;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardListener implements java.awt.event.KeyListener {

    private Figure circle;
    private Component drawingBoard;

    public KeyboardListener(Component component, Figure figure) {
        this.circle = figure;
        this.drawingBoard = component;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            circle.move(-1,0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            circle.move(1,0);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            circle.move(0,1);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            circle.move(0,-1);
        }
        drawingBoard.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
