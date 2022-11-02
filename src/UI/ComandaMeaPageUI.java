package UI;

import Models.CodeSource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComandaMeaPageUI {

    private static String Comanda = "PrincipalePage";
    private static ComandaMeaPageUI insance = new ComandaMeaPageUI();
    private JList ListOrder; // lista produse
    private JButton PrincipalPageBtn;
    private JButton ContinueShoppingBtn;
    private JButton PlaceYourOrderBtn;
    private JLabel MessageYourOrder;
    private JLabel MessageTotalPayment;
    private JLabel TotalPayment; // total de plata
    private JButton RemoveOrderBtn;
    private JPanel ComandaMeaPanel; // panel

    private ComandaMeaPageUI()
    {
        PrincipalPageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(Comanda);

            }
        });

        ContinueShoppingBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        PlaceYourOrderBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        RemoveOrderBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }

    public static ComandaMeaPageUI getInstance()
    {
        return insance;
    }
    public JPanel getPanel()
    {
        return ComandaMeaPanel;
    }




}
