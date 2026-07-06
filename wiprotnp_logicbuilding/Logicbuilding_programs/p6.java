class p6
{
	public static int getSecondLastDigit(int number)
	{
		number=Math.abs(number);
		if(number<10)
		{
			return -1;
		}
		return (number/10)%10;
	}
	public static void main(String args[])
	{
		System.out.println(getSecondLastDigit(197));
		System.out.println(getSecondLastDigit(-197));
		System.out.println(getSecondLastDigit(5));
	}
}