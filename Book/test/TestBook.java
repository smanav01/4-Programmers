
import book.Book;

public class TestBook {
	public static void main(String[] args) {
		
		Book B1 = new Book("Chetan Bhagat", "Two States", "S13", 124);
                Book B2 = new Book("Rashmi Bhansal", "Stay Hungry Stay Foolish", "R33", 126);
                Book B3 = new Book("Mahatma Gandhi", "My Experiments with Truth", "S15", 129);
                Book B4 = new Book("Thomas Hardy", "Far from the Madding Crowd", "S17", 121);
		
		String author1 = B1.getAuthor(); 
                String author2 = B2.getAuthor();
		String author3 = B3.getAuthor(); 
		String author4 = B4.getAuthor(); 

		System.out.println("The Auhtors of all books are:");
		System.out.println(author1 + "\n"  + author2 + "\n" + author3 + "\n" + author4 );
		
		String Title1 = B1.getTitle(); 
                String Title2 = B2.getTitle();
                String Title3 = B3.getTitle();
                String Title4 = B4.getTitle();
		
		System.out.println("The Title of all the books are:");
		System.out.println(Title1 + "\n" + Title2 + "\n" + Title3 + "\n" + Title4 );

		String callNumber1 = B1.getCallNumber();
                String callNumber2 = B1.getCallNumber();
                String callNumber3 = B1.getCallNumber();
                String callNumber4 = B1.getCallNumber();
                
		
		
		System.out.println("The Call Numbers of the books are:");
		System.out.println(callNumber1 + "\n" + callNumber2 + "\n" + callNumber3 + "\n" + callNumber4);
			
		int ID1 = B1.getID(); 
                int ID2 = B1.getID();
                int ID3 = B1.getID();
                int ID4 = B1.getID();
	
		System.out.println("The ID of all the Books are:");
		System.out.println(ID1 + "\n" + ID2 + "\n" + ID3 + "\n" + ID4 );
		
		System.out.println("The description of all the books are:");
		System.out.println(B1.toString() + "\n"); 
		System.out.println(B2.toString() + "\n");
		System.out.println(B3.toString() + "\n");
		System.out.println(B4.toString() + "\n");
	} 
} 