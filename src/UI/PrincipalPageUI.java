package UI;

import Models.CodeSource;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class PrincipalPageUI {
    private static PrincipalPageUI Instance = new PrincipalPageUI();
    private static String ADMINISTRATOR = "Admin"; // adaugare produs
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
    private JRadioButton MenuOfTheDay;
    private JButton Search;
    private JButton MyOrder;
    private JButton Purchase;
    private JPanel PrincipalPanel;
    private JButton AdaugareProdusBtn;

    private PrincipalPageUI() {

        Purchase.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                if(MenuOfTheDay.isSelected()){
                    //Purchast face e e nevoie altfel da eroare
                }else if(true){
                    //daca comanda mea este populata Purchast face ce trebuie altfel da mesaj de eroare
                }
                AdaugareProdusBtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        CodeSource.getInstance().setVisible(ADMINISTRATOR); // adaugare produs
                    }
                });
            }
        });

        MyOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CodeSource.getInstance().setVisible(COMMAND);// comanda mea
            }
        });

        Purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // daca selectezi supa sa te duca in menuil de supa
                //daca selectezi meniul de pizza sa te duca la meniu de pizza
                //if()
                    CodeSource.getInstance().setVisible(PIZZA);
                //if()
                    CodeSource.getInstance().setVisible(SOUP);
                //if()
                    CodeSource.getInstance().setVisible(DESERT);
                //if()
                    CodeSource.getInstance().setVisible(DRINK);


            }
        });



    }

    public static PrincipalPageUI getInstance(){
        return Instance;
    }

    public JPanel getPanel(){
        return PrincipalPanel;
    }
}
