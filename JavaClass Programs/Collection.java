
import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        LinkedList<Integer> number = new LinkedList();
        names.add("Trinkush");
        names.add("Sonanshu");
        names.add("Sharnjit");
        names.add("Riya");
        names.add("Naman");

        number.add(1001);
        number.add(1002);
        System.out.println(names.get(2));
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("");
        for (Integer integer : number) {
            System.out.println(integer);
        }

    }
}
