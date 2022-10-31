package Models;

import javax.xml.crypto.Data;

public class Pizza extends Produs {

    private String Name;

    public Pizza(String name, String brand, double quantity, String unit, double price, Data expirationData, Data productData)
    {
        Name=name;
        Brand=brand;
        Quantity = quantity;
        Unit = unit;
        Price = price;
        ExpirationData = expirationData;
        ProductData = productData;

    }

    public Pizza()
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
