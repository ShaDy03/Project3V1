package UI;

import Models.CodeSource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaUI {
    private final String PRINCIPALEPAGE = "PrincipalePage";
    public static PizzaUI instance = new PizzaUI();
    private JPanel PizzaPanel;
    private JRadioButton Type1;
    private JRadioButton Type2;
    private JRadioButton Type3;
    private JRadioButton Type4;
    private JRadioButton Type5;
    private JRadioButton Type6;
    private JButton Back;
    private JButton AddPizza;





    private PizzaUI()
    {
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(PRINCIPALEPAGE);
            }
        });
        AddPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(PRINCIPALEPAGE);
                //Adaugare comanda, verificare comanda selectata.
            }
        });
    }

    public static PizzaUI getInstance()
    {
        return instance;
    }

    public boolean isAnywaySelected()
    {
        if(Type1.isSelected())
            return true;
        if(Type2.isSelected())
            return true;
        if(Type3.isSelected())
            return true;
        if(Type4.isSelected())
            return true;
        if(Type5.isSelected())
            return true;
        if(Type6.isSelected())
            return true;
        return false;
    }







    public JPanel getPanel() {
        return PizzaPanel;
    }


}
