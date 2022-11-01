package Models;
import Data.DataClass;
import UI.LoginPageUI;
import UI.RegisterUI;

import javax.swing.*;
import java.util.ArrayList;

public class CodeSource {
    private static CodeSource Instance = new CodeSource();
    private static DataClass<Desert> DesertList = new DataClass<Desert>();
    private static DataClass<Drink> DrinkList = new DataClass<Drink>();
    private static DataClass<Pizza> PizzaList = new DataClass<Pizza>();
    private static DataClass<Soup> SoupList = new DataClass<Soup>();
    private static DataClass<User> UserList = new DataClass<User>();
    public static JFrame Login = new JFrame("Gestiunea comenzilor online!");
    public static JFrame Register = new JFrame("Gestiunea comenzilor online!");

    private CodeSource(){

    }

    public static void main(String[] args)
    {
        Login.setContentPane(LoginPageUI.getInstance().getPanel());
        Register.setContentPane(RegisterUI.getInstance().getPanel());
        Register.pack();
        Login.pack();
        Login.setVisible(true);
    }


    public static CodeSource getInstance(){
        return Instance;
    }

    public void setVisible(String name){
        Login.setVisible(false);
        Register.setVisible(false);
        if(name == "Login")
            Login.setVisible(true);
        if(name == "Register")
            Register.setVisible(true);
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
