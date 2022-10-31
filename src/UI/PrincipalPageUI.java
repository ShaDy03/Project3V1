package UI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class PrincipalPageUI {
    private JLabel Message;
    private JLabel Message2;
    private JRadioButton Soup;
    private JRadioButton Pizza;
    private JRadioButton Desert;
    private JRadioButton MenuOfTheDay;
    private JButton Search;
    private JButton MyOrder;
    private JButton Purchase;
    private JPanel PrincipalPanel;

    public PrincipalPageUI() {

        Purchase.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                if(MenuOfTheDay.isSelected()){
                    //Purchast face e e nevoie altfel da eroare
                }else if(true){
                    //daca comanda mea este populata Purchast face ce trebuie altfel da mesaj de eroare
                }
            }
        });
    }
}
