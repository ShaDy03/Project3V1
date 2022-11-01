import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Application");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0, 0, 0,208));
        frame.setSize(650,650);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}