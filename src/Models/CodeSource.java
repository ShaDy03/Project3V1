package Models;
import Data.DataClass;
import UI.LoginPageUI;
import javax.swing.*;
import java.util.ArrayList;

public class CodeSource {
    private static CodeSource Instance = new CodeSource();
    private static DataClass<Desert> DesertList = new DataClass<Desert>();
    private static DataClass<Drink> DrinkList = new DataClass<Drink>();
    private static DataClass<Pizza> PizzaList = new DataClass<Pizza>();
    private static DataClass<Soup> SoupList = new DataClass<Soup>();
    private static DataClass<User> UserList = new DataClass<User>();
    public static JFrame Frame = new JFrame("Gestiunea comenzilor online!");

    private CodeSource(){
        var adminUser = new User("admin", "admin", "12345", 20, "administrator");
        UserList.addProdus(adminUser);
    }

    public static void main(String[] args)
    {

        CodeSource.getInstance().setPanel(LoginPageUI.getInstance().getLoginPanel());
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

    public ArrayList<Desert> getDesertList(){
        return DesertList.getList();
    }

    public ArrayList<Drink> getDrinkList(){
        return DrinkList.getList();
    }

    public ArrayList<Soup> getSoupList(){
        return SoupList.getList();
    }

    public ArrayList<Pizza> getPizzaList(){
        return PizzaList.getList();
    }

    public ArrayList<User> getUserList(){
        return UserList.getList();
    }

    public void addDesert(Desert desert){
        DesertList.addProdus(desert);
    }

    public void addDrink(Drink drink){
        DrinkList.addProdus(drink);
    }

    public void addSoup(Soup soup){
        SoupList.addProdus(soup);
    }

    public void addPizza(Pizza pizza){
        PizzaList.addProdus(pizza);
    }

    public void addUser(User user){
        UserList.addProdus(user);
    }
}
