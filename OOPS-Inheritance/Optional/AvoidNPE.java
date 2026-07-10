import java.util.*;

public class AvoidNPE
{
    public static void main(String[] args)
    {
        String[] names=new String[5];

        Optional<String> op=Optional.ofNullable(names[0]);

        System.out.println(op.map(String::length).orElse(0));
    }
}