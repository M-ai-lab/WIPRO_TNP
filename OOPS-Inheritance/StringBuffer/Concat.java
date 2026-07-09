package StringBuffer;
public class Concat{
	public static void main(String[] args){
		String s1="Sachin";
		String s2="Tendulkar";

		if(Character.toLowerCase(s1.charAt(s1.length()-1))==Character.toLowerCase(s2.charAt(0)))
			System.out.println((s1+s2.substring(1)).toLowerCase());
		else
			System.out.println((s1+s2).toLowerCase());
	}
}