public class Main{
	public static void main(String[] args){
		Author author=new Author("Chetan Bhagat","chetan@gmail.com",'M');
		Book book=new Book("Half Girlfriend",author,399.50,20);

		System.out.println("Book Name: "+book.getName());
		System.out.println("Price: "+book.getPrice());
		System.out.println("Quantity: "+book.getQtyInStock());
		System.out.println("Author Name: "+book.getAuthor().getName());
		System.out.println("Author Email: "+book.getAuthor().getEmail());
		System.out.println("Author Gender: "+book.getAuthor().getGender());
	}
}