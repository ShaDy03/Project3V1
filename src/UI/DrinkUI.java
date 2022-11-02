package UI;

import Models.CodeSource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrinkUI {

    private static String Drink = "PrincipalePage";
    private static DrinkUI instance = new DrinkUI();
    private JPanel DrinkPanel;
    private JRadioButton Type1;
    private JRadioButton Type2;
    private JRadioButton Type3;
    private JRadioButton Type4;
    private JRadioButton Type5;
    private JRadioButton Type6;
    private JButton Back;
    private JButton AddDrink;
    private JLabel PriceType1;
    private JLabel PriceType2;
    private JLabel PriceType3;
    private JLabel PriceType4;
    private JLabel PriceType5;
    private JLabel PriceType6;


    private DrinkUI()
    {
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(Drink);

            }
        });
        AddDrink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //CodeSource.getInstance().setVisible(Drink);
            }
        });
    }

    public static DrinkUI getInstance()
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
        return DrinkPanel;
    }

    public JRadioButton getType1()
    {
        return Type1;
    }
    public JRadioButton getType2()
    {
        return Type2;

    }

    public JRadioButton getType3()
    {
        return Type3;
    }

    public JRadioButton getType4()
    {
        return Type4;
    }
    public JRadioButton getType5()
    {
        return Type5;
    }

    public JRadioButton getType6()
    {
        return Type6;
    }


}
