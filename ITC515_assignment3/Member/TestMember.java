
public class TestMember {
	public static void main(String[] args) {
		
		Member m0 = new Member("Shikha", "Manav", "456789", "shikha@gmail.com", 0001);
		Member m1 = new Member("Irvan", "Kaur", "345678","irvan@hotmail.com", 0002);
		Member m2 = new Member("Pratik ", "Brahmbhatt", "456889", "pratik@gmail.com",0003);
		Member m3 = new Member("Paxil", "Shah", "564232", "paxil@yahoo.com",0004);
		
		String firstName0 = m0.getFirstName(); 
		String firstName1 = m1.getFirstName(); 
		String firstName2 = m2.getFirstName(); 
		String firstName3 = m3.getFirstName(); 

		System.out.println("The firstName of all the members are:");
		System.out.println(firstName0 + ", " + firstName1 + ", " + firstName2 + ", " + firstName3 + ".");
		
		String lastName0 = m0.getLastName(); 
		String lastName1 = m1.getLastName(); 
		String lastName2 = m2.getLastName(); 
		String lastName3 = m3.getLastName(); 
		
		System.out.println("The lastName of all the members are:");
		System.out.println(lastName0 + ", " + lastName1 + ", " + lastName2 + ", " + lastName3 + ".");

		String contactPhone0 = m0.getContactPhone(); 
		String contactPhone1 = m1.getContactPhone(); 
		String contactPhone2 = m2.getContactPhone(); 
		String contactPhone3 = m3.getContactPhone(); 
		
		
		System.out.println("The Contact numbers of the Member are:");
		System.out.println(contactPhone0 + ", " + contactPhone1 + ", " + contactPhone2 + ", " + contactPhone3 + ".");
	
		String emailAddress0 = m0.getEmailAddress(); 
		String emailAddress1 = m1.getEmailAddress(); 
		String emailAddress2 = m2.getEmailAddress(); 
		String emailAddress3 = m3.getEmailAddress(); 
		
	
		System.out.println("The emailAddress of the Member are:");
		System.out.println(emailAddress0 + ", " + emailAddress1 + ", " + emailAddress2 + ", " + emailAddress3 + ".");
		
		int id0 = m0.getID(); 
		int id1 = m1.getID(); 
		int id2 = m2.getID(); 
		int id3 = m3.getID(); 
		
	
		System.out.println("The id of the Member are:");
		System.out.println(id0 + ", " + id1 + ", " + id2 + ", " + id3 + ".");
		
                
		System.out.println("The description of the created Member are:");
		System.out.println(m0.toString() + "\n"); 
		System.out.println(m1.toString() + "\n");
		System.out.println(m2.toString() + "\n");
		System.out.println(m3.toString() + "\n");
                
	} 
} 