package UI;

import Models.CodeSource;

import javax.swing.*;
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
    private JLabel TypePrice1;
    private JLabel TypePrice2;
    private JLabel TypePrice3;
    private JLabel TypePrice4;
    private JLabel TypePrice5;
    private JLabel TypePrice6;


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
                //CodeSource.getInstance().setVisible(Desert);


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

    public JLabel getTypePrice1()
    {
        return TypePrice1;
    }
    public JLabel getTypePrice2()
    {
        return TypePrice2;
    }
    public JLabel getTypePrice3()
    {
        return  TypePrice3;
    }
    public JLabel getTypePrice4()
    {
        return TypePrice4;
    }
    public JLabel getTypePrice5()
    {
        return TypePrice5;
    }
    public JLabel getTypePrice6()
    {
        return  TypePrice6;
    }


    public void setTypePrice1(javax.swing.JLabel typePrice1) {
        TypePrice1 = typePrice1;
    }

    public void setTypePrice2(JLabel typePrice2) {
        TypePrice2 = typePrice2;
    }
    public void setTypePrice3(JLabel typePrice3)
    {
        TypePrice3 = typePrice3;
    }

    public void setTypePrice4(JLabel typePrice4) {
        TypePrice4 = typePrice4;
    }

    public void setTypePrice5(JLabel typePrice5) {
        TypePrice5 = typePrice5;
    }

    public void setTypePrice6(JLabel typePrice6) {
        TypePrice6 = typePrice6;
    }



}
