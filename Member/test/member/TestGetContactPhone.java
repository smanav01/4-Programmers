/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package member;

/**
 *
 * @author Shikha
 */
import Member.Member;
public class TestGetContactPhone {
	public static void main(String[] args) {	
		Member m0 = new Member("Shikha", "Manav", "456789", "shikha@gmail.com", 0001);
		Member m1 = new Member("Irvan", "Kaur", "345678","irvan@hotmail.com", 0002);
		Member m2 = new Member("Pratik ", "Brahmbhatt", "456889", "pratik@gmail.com",0003);
		Member m3 = new Member("Paxil", "Shah", "564232", "paxil@yahoo.com",0004);
		
		
		/** Display the results */
		System.out.println("The Contact Number of the  Member 1 is: "+ m0.getContactPhone());	
		System.out.println("The Contact Number of the Member 2 is: "+ m1.getContactPhone());
                System.out.println("The Contact Number of the Member 3 is: "+ m2.getContactPhone());
                System.out.println("The Contact Number of the Member 4 is: "+ m3.getContactPhone());
		
	}	
}	
