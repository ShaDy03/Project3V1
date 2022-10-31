package Models;

import javax.xml.crypto.Data;

public class Drink extends Produs{

    private String Type; // Cola,sprite,water ,acidified water.

    public Drink(String type, String brand, double quantity, String unit, double price, Data expirationData, Data productData)
    {
        Type=type;
        Brand=brand;
        Quantity = quantity;
        Unit = unit;
        Price = price;
        ExpirationData = expirationData;
        ProductData = productData;
    }

    public Drink()
    {

    }
    public String getType()
    {
        return Type;
    }
    public void setType(String type)
    {
        Type=type;
    }


}
