package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("title");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add(new JLabel("Why?"));

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton noR = new JRadioButton("No reason.");
        JRadioButton becauseF = new JRadioButton("Because it is fun!");
        buttonGroup.add(noR);
        buttonGroup.add(becauseF);

        container.add(noR);
        container.add(becauseF);

        container.add(new JButton("Done!"));

    }


    public JFrame getFrame() {
        return frame;
    }
}
