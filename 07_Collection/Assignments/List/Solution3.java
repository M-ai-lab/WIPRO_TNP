import java.util.ArrayList;
import java.util.Iterator;;


public class Solution3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");

        printAll(arr);
    }

    static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
