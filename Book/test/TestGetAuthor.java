
import book.Book;



public class TestGetAuthor {
	public static void main(String[] args) {
		//Book B1 = new Book('Shakespeare', 'King', 'S12', 123);
		Book B1 = new Book("Chetan Bhagat", "Two States", "S13", 124);
                Book B2 = new Book("Rashmi Bhansal", "Stay Hungry Stay Foolish", "R33", 126);
                Book B3 = new Book("Mahatma Gandhi", "My Experiments with Truth", "S15", 129);
                Book B4 = new Book("Thomas Hardy", "Far from the Madding Crowd", "S17", 121);
		System.out.println("\nTesting the getAuthor() method from the book class");
		
		/** Display the results */
		System.out.println("The author of the book is:");
		System.out.println(B1.getAuthor());
                System.out.println(B2.getAuthor());
                System.out.println(B3.getAuthor());
                System.out.println(B4.getAuthor());
		//System.out.println(“It fails, because the value entered for author is integer”);
		//System.out.println(B2.getTitle());
	}
}