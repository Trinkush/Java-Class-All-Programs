
import java.util.HashMap;


public class HashMapping {
    public static void main(String[] args) {
        HashMap<String , String> data = new HashMap();
        data.put("Trinkush", "HashMap is kept in java.util package. As you can see in above definition of HashMap, it extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface. As you can see it also implements Cloneable and Serializable interface.\n" +
"K and V in above definition represents for Key and Value respectively.");
        System.out.println(data.get("Trinkush"));
    }
}
