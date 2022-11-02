package UI;
import Models.CodeSource;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoupUI {
    private final String PRINCIPALEPAGE = "PrincipalePage";
    private static SoupUI Instance = new SoupUI();
    private JPanel SoupPanel;
    private JRadioButton Type1;
    private JRadioButton Type2;
    private JRadioButton Type3;
    private JRadioButton Type4;
    private JRadioButton Type5;
    private JRadioButton Type6;
    private JButton Back;
    private JButton AddSoup;
    private JLabel TypePrice1;
    private JLabel TypePrice2;
    private JLabel TypePrice3;
    private JLabel TypePrice4;
    private JLabel TypePrice5;
    private JLabel TypePrice6;


    private SoupUI() {
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(PRINCIPALEPAGE);
            }
        });

        AddSoup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(PRINCIPALEPAGE);
                //verificare ca este selectata macar una din variante
                //in functie de ce avem in lista, tipurile de ciorbe se fac vizibile cu mesajul respectiv
            }
        });
    }

    public static SoupUI getInstance()
    {
        return Instance;
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

    public JPanel getPanel()
    {
        return SoupPanel;
    }

}
