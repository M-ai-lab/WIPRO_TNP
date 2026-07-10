import java.util.Scanner;

public class combinestrings
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();

        String result="";
        int min=Math.min(a.length(),b.length());

        for(int i=0;i<min;i++)
        {
            result=result+a.charAt(i)+b.charAt(i);
        }

        if(a.length()>b.length())
        {
            result=result+a.substring(min);
        }
        else
        {
            result=result+b.substring(min);
        }

        System.out.println(result);
    }
}