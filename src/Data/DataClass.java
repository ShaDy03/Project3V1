package Data;
import java.util.ArrayList;
public class DataClass<T> {
    private ArrayList<T> ProdusList = new ArrayList<T>();
    public void addProdus(T produs){
        ProdusList.add(produs);
    }
    public ArrayList<T> getList(){
        return ProdusList;
    }
}
