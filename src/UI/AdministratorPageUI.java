package UI;

import Models.CodeSource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorPageUI {

    private static String Admin = "PrincipalePage";
    public static AdministratorPageUI instance = new AdministratorPageUI();
    private JPanel AdministratorPanel;
    private JComboBox comboBox1;
    private JTextField textFieldName;
    private JTextField textFieldPrice;
    private JButton AdaugareBtn;
    private JLabel MessageAdministrator;
    private JLabel MessageName;
    private JLabel MesagePrice;
    private JLabel MessageDropDown;
    private JButton PrincipalPageBtn;

    private AdministratorPageUI()
    {
        AdaugareBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //CodeSource.getInstance().setVisible(Admin);

            }
        });

        PrincipalPageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(Admin);

            }
        });

    }

    public static AdministratorPageUI getInstance(){
        return instance;
    }

    public JPanel getPanel()
    {
        return AdministratorPanel;
    }



}


