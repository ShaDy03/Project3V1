package Models;

import UI.LoginPageUI;

import javax.swing.*;

public class CodeSource {
    private static CodeSource Instance = new CodeSource();
    public static JFrame Frame = new JFrame("Gestiunea comenzilor online!");

    private CodeSource(){

    }

    public static void main(String[] args)
    {

        CodeSource.getInstance().setPanel(LoginPageUI.getInstance().getPanel());
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(650,650);
        Frame.setResizable(false);
        Frame.setLayout(null);
        Frame.setVisible(true);


    }

    public static CodeSource getInstance(){
        return Instance;
    }

    public void setPanel(JPanel panel){
        Frame.setContentPane(panel);
        Frame.pack();
    }
}
