
import book.Book;



public class TestGetTitle {
	public static void main(String[] args) {
		//Book B1 = new Book('Shakespeare', 'King', 'S12', 123);
		Book B1 = new Book("Shakespeare", "King Leare", "S12", 123);
                Book B2 = new Book("Charles Dickens", "Great Expectations", "R32", 124);
                Book B3 = new Book("Jane Austin", "Pride and Prejudice", "S12", 123);
                Book B4 = new Book("George Orwell", "Animal Farm", "S12", 123);
		System.out.println("\nTesting the getTitle() method from the book class");
		
		/** Display the results */
		System.out.println("The title of the book is:");
		System.out.println(B1.getTitle());
                System.out.println(B2.getTitle());
                System.out.println(B3.getTitle());
                System.out.println(B4.getTitle());
		//System.out.println(“It fails, because the value entered for author is integer”);
		//System.out.println(B2.getTitle());
	}
}