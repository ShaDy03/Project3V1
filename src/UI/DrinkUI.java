package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrinkUI {

    private static DrinkUI instance;
    private JPanel DrinkPanel;
    private JRadioButton Type1;
    private JRadioButton Type2;
    private JRadioButton Type3;
    private JRadioButton Type4;
    private JRadioButton Type5;
    private JRadioButton Type6;
    private JButton Back;
    private JButton AddDrink;

    private DrinkUI(JPanel drinkPanel, JRadioButton type1, JRadioButton type2, JRadioButton type3, JRadioButton type4, JRadioButton type5, JRadioButton type6,JButton back,JButton addDrink)
    {
        DrinkPanel=drinkPanel;
        Type1=type1;
        Type2=type2;
        Type3=type3;
        Type4=type4;
        Type5=type5;
        Type6=type6;
        Back=back;
        AddDrink=addDrink;

    }
    public static DrinkUI getInstance(JPanel drinkPanel, JRadioButton type1, JRadioButton type2, JRadioButton type3, JRadioButton type4, JRadioButton type5, JRadioButton type6,JButton back,JButton addDrink)
    {
        if(instance==null)
        {
            instance = new DrinkUI(drinkPanel,type1,type2,type3,type4,type5,type6,back,addDrink);
        }
        return instance;
    }



    public DrinkUI()
    {
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // inapoi meniu/pagina precedenta?

            }
        });
        AddDrink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Adaugare comanda, verificare comanda selectata.
                //pagina principala sau pagina urmatoare ?.
                //Sau creare buton special doar pentru pagina principala?
            }
        });
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

    public JPanel getDrinkPanel() {
        return DrinkPanel;
    }


}
