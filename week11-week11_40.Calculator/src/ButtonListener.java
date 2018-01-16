import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JTextField input;
    private JTextField output;
    private JButton add;
    private JButton subtract;
    private JButton reset;
    private Calculator calculator;


    public ButtonListener(JTextField input, JTextField output, JButton add, JButton subtract, JButton reset, Calculator calculator) {
        this.input = input;
        this.output = output;
        this.add = add;
        this.subtract = subtract;
        this.reset = reset;
        this.calculator = calculator;
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        int value = 0;

        try {
            Integer.parseInt(input.getText());
        } catch (Exception e) {
        }

        if (ae.getSource() == add) {
            calculator.addition(value);

        } else if (ae.getSource() == subtract) {
            calculator.subtraction(value);

        } else if (ae.getSource() == reset) {
            calculator.reset();
        }
        int calcOutput = calculator.getSum();

        input.setText("");
        output.setText("" + calcOutput);

        if (calcOutput == 0) {
            reset.setEnabled(false);
        } else {
            reset.setEnabled(true);
        }
    }

    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            try {
                int x = Integer.parseInt(input.getText());
                if (x > 0) {
                    calculator.addition(x);
                    setOutput();
                } else {
                    input.setText("");
                }
            } catch (NumberFormatException e1) {
                input.setText("");
            }

        } else if (e.getSource() == subtract) {
            try {
                int x = Integer.parseInt(input.getText());
                if (x > 0) {
                    calculator.subtraction(x);
                    setOutput();
                } else {
                    input.setText("");
                }
            } catch (NumberFormatException e1) {
                input.setText("");
            }

        } else if (e.getSource() == reset) {
            calculator.reset();
            setOutput();
            reset.setEnabled(false);
        }
    }

    private void setOutput() {
        output.setText("" + calculator.getSum());
        input.setText("");
        reset.setEnabled(true);
    }                                                   */


}
