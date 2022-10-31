package Interface;
import javax.xml.crypto.Data;

public interface IMethodClass {
    public String getBrand();
    public void setBrand(String brand);
    public double getQuantity();
    public void setQuantity(double quantity);
    public Data getExpirationData();
    public Data getProductData();
    public void setProdusData(Data productData, Data expirationData);
    public void setUnit(String unit);
    public String getUnit();
    public double getPrice();
    public void setPrice(double price);
}
