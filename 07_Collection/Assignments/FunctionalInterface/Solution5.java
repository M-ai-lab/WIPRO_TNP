import java.util.*;
import java.util.function.Predicate;

public class Solution5{
    public static void main(String[] args){

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(
                1,4,5,9,12,16,20,25,36,50));

        Predicate<Integer> p=n->{
            int r=(int)Math.sqrt(n);
            return r*r==n;
        };

        list.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}