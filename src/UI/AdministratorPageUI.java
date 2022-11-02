package UI;

import Models.CodeSource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorPageUI {

    private final String ADMIN = "PrincipalePage";
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
    }

    public static AdministratorPageUI getInstance(){
        return instance;
    }

    public JPanel getPanel()
    {
        return AdministratorPanel;
    }




}


