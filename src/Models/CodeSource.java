package Models;
import Data.DataClass;
import UI.*;
import javax.swing.*;
import java.util.ArrayList;

public class CodeSource {
    private static CodeSource Instance = new CodeSource();
    private static DataClass<Desert> DesertList = new DataClass<Desert>();
    private static DataClass<Drink> DrinkList = new DataClass<Drink>();
    private static DataClass<Pizza> PizzaList = new DataClass<Pizza>();
    private static DataClass<Soup> SoupList = new DataClass<Soup>();
    private static DataClass<User> UserList = new DataClass<User>();

    private static DataClass<Produs> MyComand = new DataClass<Produs>();
    public static JFrame Login = new JFrame("Gestiunea comenzilor online!");
    public static JFrame Register = new JFrame("Gestiunea comenzilor online!");
    public static JFrame PrincipalePage = new JFrame("Gestiunea comenzilor online!");
    public static JFrame Pizza = new JFrame("Gestiunea comenzilor online!");
    public static JFrame Soup = new JFrame("Gestiunea comenzilor online!");
    public static JFrame Desert = new JFrame("Gestiunea comenzilor online!");
    public static JFrame Drink = new JFrame("Gestiunea comenzilor online!");
    public static JFrame Admin = new JFrame("Gestiunea comenzilor online!");
    public static JFrame Command = new JFrame("Gestiunea comenzilor online!");

    private CodeSource(){

    }

    public static void main(String[] args)
    {
        var adminUser = new User("admin", "admin", "12345", 20, "administrator");
        var commonUser = new User("default", "default", "12345", 20, "default");
        UserList.addProdus(adminUser);
        UserList.addProdus(commonUser);
        Login.setContentPane(LoginPageUI.getInstance().getPanel());
        Register.setContentPane(RegisterUI.getInstance().getPanel());
        PrincipalePage.setContentPane(PrincipalPageUI.getInstance().getPanel());
        Pizza.setContentPane(PizzaUI.getInstance().getPanel());
        Soup.setContentPane(SoupUI.getInstance().getPanel());
        Desert.setContentPane(DesertUI.getInstance().getPanel());
        Drink.setContentPane(DrinkUI.getInstance().getPanel());
        Admin.setContentPane(AdministratorPageUI.getInstance().getPanel());
        Command.setContentPane(ComandaMeaPageUI.getInstance().getPanel());

        ButtonGroup principalPageGroup = new ButtonGroup();
        principalPageGroup.add(PrincipalPageUI.getInstance().getDesert());
        principalPageGroup.add(PrincipalPageUI.getInstance().getSoup());
        principalPageGroup.add(PrincipalPageUI.getInstance().getPizza());
        principalPageGroup.add(PrincipalPageUI.getInstance().getDrink());

        ButtonGroup desertGroup = new ButtonGroup();
        var dInst = DesertUI.getInstance();
        desertGroup.add(dInst.getType1());
        desertGroup.add(dInst.getType2());
        desertGroup.add(dInst.getType3());
        desertGroup.add(dInst.getType4());
        desertGroup.add(dInst.getType5());
        desertGroup.add(dInst.getType6());

        ButtonGroup drinkGroup = new ButtonGroup();
        var drInst = DrinkUI.getInstance();
        drinkGroup.add(drInst.getType1());
        drinkGroup.add(drInst.getType2());
        drinkGroup.add(drInst.getType3());
        drinkGroup.add(drInst.getType4());
        drinkGroup.add(drInst.getType5());
        drinkGroup.add(drInst.getType6());

        ButtonGroup soupGroup = new ButtonGroup();
        var sInst = SoupUI.getInstance();
        drinkGroup.add(sInst.getType1());
        drinkGroup.add(sInst.getType2());
        drinkGroup.add(sInst.getType3());
        drinkGroup.add(sInst.getType4());
        drinkGroup.add(sInst.getType5());
        drinkGroup.add(sInst.getType6());

        ButtonGroup pizzaGroup = new ButtonGroup();
        var pInst = SoupUI.getInstance();
        drinkGroup.add(pInst.getType1());
        drinkGroup.add(pInst.getType2());
        drinkGroup.add(pInst.getType3());
        drinkGroup.add(pInst.getType4());
        drinkGroup.add(pInst.getType5());
        drinkGroup.add(pInst.getType6());

        PrincipalePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Desert.pack();
        Drink.pack();
        Soup.pack();
        Pizza.pack();
        PrincipalePage.pack();
        Register.pack();
        Admin.pack();
        Command.pack();
        Login.pack();
        Login.setVisible(true);
    }


    public static CodeSource getInstance(){
        return Instance;
    }

    public void setVisible(String name){
        Login.setVisible(false);
        Register.setVisible(false);
        PrincipalePage.setVisible(false);
        Pizza.setVisible(false);
        Soup.setVisible(false);
        Desert.setVisible(false);
        Drink.setVisible(false);
        Admin.setVisible(false);
        Command.setVisible(false);

        if(name == "Login")
            Login.setVisible(true);
        if(name == "Register")
            Register.setVisible(true);
        if(name == "PrincipalePage")
            PrincipalePage.setVisible(true);
        if(name == "Pizza")
            Pizza.setVisible(true);
        if(name == "Soup")
            Soup.setVisible(true);
        if(name == "Desert")
            Desert.setVisible(true);
        if(name == "Drink")
            Drink.setVisible(true);
        if(name == "Admin")
            Admin.setVisible(true);
        if(name == "Command")
            Command.setVisible(true);
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

    public void addCommand(Produs produs){
        MyComand.addProdus(produs);
    }

    public ArrayList<Produs> getMyComandList(){
        return MyComand.getList();
    }

    public void clearMyComandList(){
        MyComand.getList().clear();
    }
}
