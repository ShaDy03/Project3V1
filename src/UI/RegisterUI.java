package UI;

import Models.CodeSource;
import Models.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUI {
    private final String LOGIN = "Login";
    private static RegisterUI instance = new RegisterUI();
    private JPanel RegisterPanel;
    private JTextField UserNameTF;
    private JTextField NameTF;
    private JTextField AgeTF;
    private JPasswordField PasswordTF;
    private JButton ResetBtn;
    private JLabel Message1;
    private JLabel Message2;
    private JLabel MessageUserName;
    private JLabel MessageName;
    private JLabel MessageAge;
    private JLabel MessagePassword;
    private JButton RegisterBtn;
    private JLabel TextSuccessful;

    private RegisterUI()
    {
        ResetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==ResetBtn)
                {
                    UserNameTF.setText("");
                    NameTF.setText("");
                    AgeTF.setText("");
                    PasswordTF.setText("");
                }
            }
        });

        RegisterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==RegisterBtn)
                {
                    User user = new User(NameTF.getText(), UserNameTF.getText(),PasswordTF.getText(),Integer.parseInt(AgeTF.getText()));
                    CodeSource.getInstance().addUser(user);
                    CodeSource.getInstance().setVisible(LOGIN);
                }
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
