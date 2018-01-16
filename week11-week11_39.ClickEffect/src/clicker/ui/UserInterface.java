package clicker.ui;

import clicker.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private int value = 0;
    private Calculator calculator = new Calculator() {

        @Override
        public int giveValue() {
            return value;
        }

        @Override
        public void increase() {
            value++;
        }
    };

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);

        JLabel output = new JLabel("0");

        JButton theButton = new JButton("Click!");
        ClickListener buttonListener = new ClickListener(calculator,output);
        theButton.addActionListener(buttonListener);

        container.add(output);
        container.add(theButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
