class Fruit{
	String name;
	String taste;
	String size;

	public Fruit(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}

	public void eat(){
		System.out.println(name+" is "+taste+" in taste.");
	}
}

class Apple extends Fruit{
	public Apple(String name,String taste,String size){
		super(name,taste,size);
	}

	@Override
	public void eat(){
		System.out.println(name+" is sweet in taste.");
	}
}

class Orange extends Fruit{
	public Orange(String name,String taste,String size){
		super(name,taste,size);
	}

	@Override
	public void eat(){
		System.out.println(name+" is sour in taste.");
	}
}

public class FruitMain{
	public static void main(String[] args){
		Apple a=new Apple("Apple","Sweet","Medium");
		Orange o=new Orange("Orange","Sour","Medium");

		a.eat();
		o.eat();
	}
}