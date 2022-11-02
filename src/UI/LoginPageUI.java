package UI;
import Models.CodeSource;
import Models.User;
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
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(UserName.getText().equals("") || Password.getText().equals("")){
                    Message();
                    return;
                }
                for(User i: CodeSource.getInstance().getUserList()){
                    if(i.getUserName().equals(UserName.getText()) && i.getPassword().equals(Password.getText())){
                        CodeSource.getInstance().setVisible(PRINCIPALEPAGE);
                        if(i.getRole() == "administrator")
                            PrincipalPageUI.getInstance().getAdaugareProdusBtn().setVisible(true);
                        else
                            PrincipalPageUI.getInstance().getAdaugareProdusBtn().setVisible(false);
                    }

                }
            }
        });
    }
    public static LoginPageUI getInstance(){
        return Instance;
    }
    public JPanel getPanel(){
        return LoginPanel;
    }
    private void Message(){
        JOptionPane.showMessageDialog(
                new JFrame(),
                "Complecteaza toate camputrile!",
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
