import java.util.Scanner;
class p1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Greater number = "+a);
		}
		else if(b>a)
		{
			System.out.println("Greater number = "+b);
		}
		else
		{
			System.out.println("Both numbers are equal.");
		}
		sc.close();
	}
}