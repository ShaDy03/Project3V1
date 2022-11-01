package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrinkUI {
    private JPanel DrinkPanel;
    private JRadioButton Type1;
    private JRadioButton Type2;
    private JRadioButton Type3;
    private JRadioButton Type4;
    private JRadioButton Type5;
    private JRadioButton Type6;
    private JButton Back;
    private JButton AddDrink;


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
