import java.util.*;

public class Adress
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String address=sc.nextLine();

        Optional<String> op=Optional.ofNullable(address);

        System.out.println(op.orElse("India"));
    }
}