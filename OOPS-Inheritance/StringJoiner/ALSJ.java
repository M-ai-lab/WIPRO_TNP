import java.util.*;

public class ALSJ
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        ArrayList<String> list=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            list.add(sc.nextLine());
        }

        StringJoiner sj=new StringJoiner(",","{","}");

        for(String name:list)
        {
            sj.add(name);
        }

        System.out.println(sj);
    }
}