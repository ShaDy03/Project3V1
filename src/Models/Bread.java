package Models;
import javax.xml.crypto.Data;

public class Bread extends Produs{

    private String Type; // Rye bread , white bread , seed bread
    private String Model; // sliced bread, bun bread , baguette bread


    public Bread(String type , String model, String brand, double quantity, String unit, double price, Data expirationData, Data productData)
    {
        Type=type;
        Model=model;
        Brand=brand;
        Quantity = quantity;
        Unit = unit;
        Price = price;
        ExpirationData = expirationData;
        ProductData = productData;

    }
    public Bread()
    {

    }

    public String getType()
    {
        return Type;
    }

    public String getModel()
    {
        return Model;
    }

    public void setType(String type){
        Type=type;

    }

    public void setModel(String model)
    {
       Model=model;
    }







}
