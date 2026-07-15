import java.util.*;
import java.util.function.Consumer;

public class Solution7 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                2,5,8,11,14,17,20,23,26,29));

        Consumer<Integer> c = n -> {
            if(n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };

        list.forEach(c);
    }
}