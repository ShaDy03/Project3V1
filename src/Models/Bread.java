package Models;

public class Bread extends Produs{

    private String Type; // Rye bread , white bread , seed bread
    private String Model; // sliced bread, bun bread , baguette bread


    public String getType()
    {
        return Type;
    }

    public String getModel()
    {
        return Model;
    }

    public void setType(String type){
        this.Type=type;

    }

    public void setModel(String model)
    {
        this.Model=model;
    }

    Bread(String type , String model)
    {
        this.Type=type;
        this.Model=model;
    }
    Bread()
    {

    }





}
