package Models;

import javax.xml.crypto.Data;

public class Desert extends Produs{

    private String Name; // cheesecake , muffin , donuts

    public Desert(String name, String brand, double quantity, String unit, double price, Data expirationData, Data productData)
    {
        Name=name;
        Brand=brand;
        Quantity = quantity;
        Unit = unit;
        Price = price;
        ExpirationData = expirationData;
        ProductData = productData;

    }

    public Desert()
    {

    }
    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name=name;
    }



}
