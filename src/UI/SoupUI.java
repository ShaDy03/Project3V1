package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoupUI {

    private static SoupUI instance;
    private JPanel SoupPanel;
    private JRadioButton Type1;
    private JRadioButton Type2;
    private JRadioButton Type3;
    private JRadioButton Type4;
    private JRadioButton Type5;
    private JRadioButton Type6;
    private JButton Back;
    private JButton AddSoup;


    private SoupUI() {
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //inapoi pe pagina principala
            }
        });

        AddSoup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //inapoi pe pagina principala plus adaugare comanda
                //verificare ca este selectata macar una din variante
                //in functie de ce avem in lista, tipurile de ciorbe se fac vizibile cu mesajul respectiv
            }
        });
    }

    public static SoupUI getInstance()
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

    public JPanel getPanel()
    {
        return SoupPanel;
    }

}
