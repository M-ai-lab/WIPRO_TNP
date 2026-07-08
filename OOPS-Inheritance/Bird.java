public class Bird extends Animal{
	@Override
	public void eat(){
		System.out.println("Bird eats");
	}

	@Override
	public void sleep(){
		System.out.println("Bird sleeps");
	}

	public void fly(){
		System.out.println("Bird flies");
	}
}