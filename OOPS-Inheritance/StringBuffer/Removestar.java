import java.util.Scanner;

public class Removestar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int index = str.indexOf('*');

        String left = "";
        String right = "";

        if(index>1)
        {
            left=str.substring(0,index-1);
        }

        if(index<str.length()-2)
        {
            right=str.substring(index+2);
        }

        System.out.println(left+right);
    }
}