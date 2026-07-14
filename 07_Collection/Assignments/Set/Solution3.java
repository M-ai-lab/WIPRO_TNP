import java.util.Iterator;
import java.util.TreeSet;

public class Solution3 {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("Banana");
        ts.add("Orange");
        ts.add("Mango");

        TreeSet<String> reversedTreeSet = new TreeSet<>(ts.descendingSet());

        System.out.println("Reversed elements:");

        for (String element : reversedTreeSet) {
            System.out.println(element);
        }

        System.out.println("\nIterating elements using Iterator:");

        Iterator<String> iterator = ts.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String searchElement = "Banana";

        if (ts.contains(searchElement)) {
            System.out.println("\n'" + searchElement + "' exists in the TreeSet.");
        } else {
            System.out.println("\n'" + searchElement + "' does not exist in the TreeSet.");
        }
    }
}