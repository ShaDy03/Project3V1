package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUI {
    private JPanel RegisterPanel;
    private JTextField textFieldName;
    private JTextField textFieldSecondName;
    private JTextField textFieldAge;
    private JPasswordField passwordField1;
    private JButton LoginBtn;
    private JButton ResetBtn;
    private JLabel Message1;
    private JLabel Message2;
    private JLabel MessageName;
    private JLabel MessageSecond;
    private JLabel MessageAge;
    private JLabel MessagePassword;

    public RegisterUI()
    {
        ResetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Reset button

            }
        });
        LoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Login button

            }
        });
    }

    public JPanel getRegisterPanel() {
        return RegisterPanel;
    }
}
