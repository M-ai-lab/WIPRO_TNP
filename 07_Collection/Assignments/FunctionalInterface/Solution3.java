import java.util.*;
import java.util.function.Predicate;

public class Solution3{
    public static void main(String[] args){

        ArrayList<String> list=new ArrayList<>(Arrays.asList(
                "madam","apple","level","java","radar",
                "hello","malayalam","racecar","book","noon"));

        Predicate<String> p=s->s.equalsIgnoreCase(
                new StringBuilder(s).reverse().toString());

        list.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}