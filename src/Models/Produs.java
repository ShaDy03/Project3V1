package Models;
import Interface.IMethodClass;
import javax.xml.crypto.Data;

public class Produs implements IMethodClass {
    protected String Brand;
    protected double Quantity;
    protected String Unit;
    protected double Price;
    protected Data ExpirationData;
    protected Data ProductData;

    @Override
    public String getBrand() {
        return Brand;
    }

    @Override
    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public double getQuantity() {
        return Quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    @Override
    public Data getExpirationData() {
        return ExpirationData;
    }

    @Override
    public Data getProductData() {
        return ProductData;
    }

    @Override
    public void setProdusData(Data productData, Data expirationData) {
        ProductData = productData;
        ExpirationData = expirationData;
    }

    @Override
    public void setUnit(String unit) {
        Unit = unit; //unitate de masura
    }

    @Override
    public String getUnit() {
        return Unit;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(double price) {
        Price = price;
    }
}
