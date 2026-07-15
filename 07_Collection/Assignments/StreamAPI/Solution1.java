import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                10,-2,-5,7,-8,12,-14,15,-20,3,6,-18));

        ArrayList<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Original List:");
        System.out.println(list);

        System.out.println("Negative Even Numbers:");
        System.out.println(result);
    }
}