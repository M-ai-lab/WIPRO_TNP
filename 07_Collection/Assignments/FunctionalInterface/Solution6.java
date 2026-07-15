import java.util.*;
import java.util.function.Consumer;

public class Solution6{
    public static void main(String[] args){

        ArrayList<String> list=new ArrayList<>(Arrays.asList(
                "Java","Python","Oracle","Spring","React",
                "Angular","SQL","Docker","Linux","Cloud"));

        Consumer<ArrayList<String>> c=l->{
            for(int i=0;i<l.size();i++){
                String rev=new StringBuilder(l.get(i)).reverse().toString();
                l.set(i,rev);
            }
        };

        c.accept(list);

        System.out.println(list);
    }
}