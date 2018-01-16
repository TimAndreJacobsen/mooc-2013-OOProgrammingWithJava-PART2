package clicker.ui;

import clicker.applicationlogic.Calculator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener{

    private Calculator calc;
    private JLabel jLabel;

    public ClickListener(Calculator calc, JLabel jLabel) {
        this.calc = calc;
        this.jLabel = jLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        String value = "" + calc.giveValue();
        jLabel.setText(value);
    }
}
