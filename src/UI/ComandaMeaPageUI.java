package UI;

import Models.CodeSource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ComandaMeaPageUI {

    private final String COMANDA = "PrincipalePage";
    private static ComandaMeaPageUI insance = new ComandaMeaPageUI();
    private JList ListOrder; // lista produse
    private JButton ContinueShoppingBtn;
    private JButton PlaceYourOrderBtn;
    private JLabel MessageYourOrder;
    private JLabel MessageTotalPayment;
    private JLabel TotalPayment; // total de plata
    private JButton RemoveOrderBtn;
    private JPanel ComandaMeaPanel; // panel

    private ComandaMeaPageUI()
    {
        ContinueShoppingBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(COMANDA);
            }
        });

        PlaceYourOrderBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Message();
                CodeSource.getInstance().clearMyComandList();
                CodeSource.getInstance().setVisible(COMANDA);
            }
        });

        RemoveOrderBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ErrorMessage();
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
    public void setTotalPayment(double sum){
        String suma = sum + " lei";
        TotalPayment.setText(suma);
    }
    public void setListOrder(ArrayList<String> lista){
        ListOrder.setListData(lista.toArray());
    }

    private void Message(){
        JOptionPane.showMessageDialog(
                new JFrame(),
                "Comanda ta in valoare de " + TotalPayment.getText() + " a fost plasata!",
                "Succesfuly",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
    private void ErrorMessage(){
        JOptionPane.showMessageDialog(
                new JFrame(),
                "Urmeaza a fi implementata!",
                "Feature",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
