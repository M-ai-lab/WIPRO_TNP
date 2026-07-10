import java.util.Scanner;

public class RepeatlastN
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        int n=sc.nextInt();

        String last=str.substring(str.length()-n);

        String result="";

        for(int i=0;i<n;i++)
        {
            result=result+last;
        }

        System.out.println(result);
    }
}