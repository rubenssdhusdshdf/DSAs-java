import java.util.List;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(20);

        // Populate the ArrayList
        myList.add("Enda");
        myList.add("Dublin");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("myList" + (i + 1) + ": " + myList.get(i));
        }

        myList.add(2, myList.get(0));
        myList.set(0, "DataStructures");
        myList.remove("Dublin");

        System.out.println("After add/set");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("myList" + (i + 1) + ": " + myList.get(i));
        }
    }
}
