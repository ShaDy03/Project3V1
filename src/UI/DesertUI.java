package UI;

import Models.CodeSource;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesertUI {

    private final String Desert = "PrincipalePage";
    private static DesertUI instance = new DesertUI(); // singleton
    private JPanel DesertPanel;
    private JRadioButton Type1;
    private JRadioButton Type2;
    private JRadioButton Type3;
    private JRadioButton Type4;
    private JRadioButton Type5;
    private JRadioButton Type6;
    private JButton Back;
    private JButton AddDesert;
    private JLabel PriceType1;
    private JLabel PriceType2;
    private JLabel PriceType3;
    private JLabel PriceType4;
    private JLabel PriceType5;
    private JLabel PriceType6;


    private DesertUI() {

        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(Desert);

            }
        });


        AddDesert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(Desert);


            }
        });
    }

    public static DesertUI getInstance()
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
        return DesertPanel;
    }



}
