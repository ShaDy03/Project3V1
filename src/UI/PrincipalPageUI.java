package UI;
import Models.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
public class PrincipalPageUI {
    private static PrincipalPageUI Instance = new PrincipalPageUI();
    private static String ADMINISTRATOR = "Admin"; // adaugare produs
    private static String PP = "PrincipalePage"; // adaugare produs
    private static String LOGIN = "Login"; // adaugare produs
    private static String COMMAND = "Command"; // comanda mea
    private static String PIZZA ="Pizza"; // pizza
    private static String SOUP = "Soup"; // ciorba/supa
    private static String DESERT = "Desert"; // desert
    private static String DRINK = "Drink"; // Bautura
    private JLabel Message;
    private JLabel Message2;
    private JRadioButton Soup;
    private JRadioButton Pizza;
    private JRadioButton Desert;
    private JRadioButton Drink;
    private JButton MyOrder;
    private JButton Purchase;
    private JPanel PrincipalPanel;
    private JButton AdaugareProdusBtn;
    private JButton LogOut;
    private PrincipalPageUI() {
        Purchase.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                if(Drink.isSelected()){
                    //Purchast face e e nevoie altfel da eroare
                }else if(true){
                    //daca comanda mea este populata Purchast face ce trebuie altfel da mesaj de eroare
                }
            }
        });
        AdaugareProdusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Message();
                CodeSource.getInstance().setVisible(PP);
            }
        });
        MyOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> list = new ArrayList<String>();
                var sum = 0;
                for(Produs i : CodeSource.getInstance().getMyComandList()){
                    list.add(PrincipalPageUI.getInstance().toString(i));
                    sum += i.getPrice();
                }
                ComandaMeaPageUI.getInstance().setTotalPayment(sum);
                ComandaMeaPageUI.getInstance().setListOrder(list);
                CodeSource.getInstance().setVisible(COMMAND);// comanda mea
            }
        });
        Purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Pizza.isSelected())
                    CodeSource.getInstance().setVisible(PIZZA);
                if(Soup.isSelected())
                    CodeSource.getInstance().setVisible(SOUP);
                if(Desert.isSelected())
                    CodeSource.getInstance().setVisible(DESERT);
                if(Drink.isSelected())
                    CodeSource.getInstance().setVisible(DRINK);
            }
        });
        LogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(LOGIN);
            }
        });
    }
    public static PrincipalPageUI getInstance(){
        return Instance;
    }
    public JPanel getPanel(){
        return PrincipalPanel;
    }
    public JRadioButton getSoup(){
        return Soup;
    }
    public JRadioButton getPizza(){
        return Pizza;
    }
    public JRadioButton getDrink(){
        return Drink;
    }
    public JRadioButton getDesert(){
        return Desert;
    }
    public JButton getAdaugareProdusBtn(){
        return AdaugareProdusBtn;
    }
    public String toString(Produs produs){
        StringBuffer message = new StringBuffer();
        if( produs.getClass().getTypeName() == "Models.Desert")
            message.append(((Desert) produs).getName() + " ");
        if (produs.getClass().getTypeName() == "Models.Drink")
            message.append(((Drink)produs).getType() + " ");
        if(produs.getClass().getTypeName() == "Models.Soup")
            message.append(((Soup) produs).getName() + " ");
        if(produs.getClass().getTypeName() == "Models.Pizza")
            message.append(((Pizza) produs).getName() + " ");
        message.append(produs.getPrice());
        return message.toString();
    }
    private void Message(){
        JOptionPane.showMessageDialog(
                new JFrame(),
                "Urmeaza a fi implementata!",
                "Feature",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
