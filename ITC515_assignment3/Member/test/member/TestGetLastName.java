
package member;

/**
 *
 * @author paxil
 */
import Member.Member;
public class TestGetLastName {
	public static void main(String[] args) {
                Member m0 = new Member("Paxil", "Shah", "5252552", "Paxil@yahoo.com", 0001);
		Member m1 = new Member("Abhan", "Chavda", "52525555","Abhan@yahoo.com", 0002);
		Member m2 = new Member("Ravi", "Jay", "52525554", "Ravi@yahoo.com",0003);
		Member m3 = new Member("Pratty", "Jog", "52525556", "Pratty@yahoo.com",0004);
		

		/** Display the results */
		System.out.println("The Last Name of the  Member 1 is: "+ m0.getLastName());
		System.out.println("The Last Name of the Member 2 is: "+ m1.getLastName());
                System.out.println("The Last Name of the  Member 3 is: "+ m2.getLastName());
		System.out.println("The Last Name of the Member 4 is: "+ m3.getLastName());

	}
}
