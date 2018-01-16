package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        /* /////  Tests didn't accept scale-able smiley ////////
        // Left eye
        graphics.fillRect((getWidth()/8)*2,(getHeight()/8)*1,getWidth()/8,getHeight()/8);
        // Right eye
        graphics.fillRect((getWidth()/8)*5,(getHeight()/8)*1,getWidth()/8,getHeight()/8);

        // Left dimple
        graphics.fillRect((getWidth()/8)*1,(getHeight()/8)*4,getWidth()/8,getHeight()/8);
        // Right dimple
        graphics.fillRect((getWidth()/8)*6,(getHeight()/8)*4,getWidth()/8,getHeight()/8);

        // mouth
        graphics.fillRect((getWidth()/8)*2,(getHeight()/8)*5,(getWidth()/8)*4,getHeight()/8);
        */


        // Left eye
        graphics.fillRect(100,50,50,50);
        // Right eye
        graphics.fillRect(250,50,50,50);

        // Left dimple
        graphics.fillRect(50,200,50,50);
        // Right dimple
        graphics.fillRect(300,200,50,50);

        // mouth
        graphics.fillRect(100,250,200,50);


    }
}
