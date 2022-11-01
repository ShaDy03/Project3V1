package UI;

import Models.CodeSource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUI {
    private static RegisterUI instance = new RegisterUI();
    private JPanel RegisterPanel;
    private JTextField textFieldName;
    private JTextField textFieldSecondName;
    private JTextField textFieldAge;
    private JPasswordField passwordField1;
    private JButton LoginBtn;
    private JButton ResetBtn;
    private JLabel Message1;
    private JLabel Message2;
    private JLabel MessageUserName;
    private JLabel MessageName;
    private JLabel MessageAge;
    private JLabel MessagePassword;
    private JButton RegisterBtn;

    private RegisterUI()
    {
        ResetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==ResetBtn)
                {
                    textFieldName.setText("");
                    textFieldSecondName.setText("");
                    textFieldAge.setText("");
                    passwordField1.setText("");
                }
            }
        });
        LoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setPanel(LoginPageUI.getInstance().getPanel());

            }
        });
    }

    public static RegisterUI getInstance()
    {
        return instance;
    }

    public JPanel getPanel() {
        return RegisterPanel;
    }
}
