public class Main2{
	public static void main(String[] args){
		Animal a=new Animal();
		System.out.println("Animal Object");
		a.eat();
		a.sleep();

		Bird b=new Bird();
		System.out.println("Bird Object");
		b.eat();
		b.sleep();
		b.fly();
	}
}