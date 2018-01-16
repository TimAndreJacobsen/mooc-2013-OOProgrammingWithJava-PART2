package noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListener implements ActionListener {

    private JTextField topTextBox;
    private JLabel botTextBox;

    public ActionEventListener(JTextField topTextBox, JLabel botTextBox) {
        this.topTextBox = topTextBox;
        this.botTextBox = botTextBox;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        this.botTextBox.setText(this.topTextBox.getText());
        this.topTextBox.setText("");
    }
}
