
import java.awt.*;
import javax.swing.*;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private Calculator calculator = new Calculator();

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField upperOutputTextField = new JTextField("0");
        upperOutputTextField.setEnabled(false);
        container.add(upperOutputTextField);

        JTextField middleInputTextField = new JTextField();
        container.add(middleInputTextField);

        container.add(createPanel(middleInputTextField, upperOutputTextField));

    }

    private JPanel createPanel(JTextField input, JTextField output) {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton add = new JButton("+");
        panel.add(add);

        JButton subtract = new JButton("-");
        panel.add(subtract);

        JButton reset = new JButton("Z");
        panel.add(reset);
        reset.setEnabled(false);

        ButtonListener buttonListener = new ButtonListener(input, output, add, subtract, reset, this.calculator);

        add.addActionListener(buttonListener);
        subtract.addActionListener(buttonListener);
        reset.addActionListener(buttonListener);

        return panel;
    }



    public JFrame getFrame() {
        return frame;
    }

}

