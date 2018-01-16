package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {

        frame = new JFrame("title");
        frame.setPreferredSize(new Dimension(500, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);


    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField leftInput = new JTextField();


        JLabel rightOuput = new JLabel();


        JButton button = new JButton("Copy!");
        button.addActionListener(new ActionEventListener(leftInput,rightOuput));


        container.add(leftInput);
        container.add(button);
        container.add(rightOuput);
    }
}
