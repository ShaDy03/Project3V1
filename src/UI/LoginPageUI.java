package UI;
import Models.CodeSource;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPageUI {
    private final String PRINCIPALEPAGE = "PrincipalePage";
    private final String REGISTER = "Register";
    private static LoginPageUI Instance = new LoginPageUI();
    private JLabel Message;
    private JTextField UserName;
    private JPasswordField Password;
    private JButton Login;
    private JButton Register;
    private JPanel LoginPanel;

    private LoginPageUI(){
        Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(REGISTER);
            }
        });
    }

    public static LoginPageUI getInstance(){
        return Instance;
    }

    public JPanel getPanel(){
        return LoginPanel;
    }
}
