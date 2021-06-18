/**
 * 
 * @author Sanobar Mujawar
 * @since 18.06.21
 * 
 * Purpose: To validate user input using regex
 * 
 */

package regexpattern;
import java.util.regex.Pattern;
import java.util.Scanner;


public class UserRegistration {

	static User user = new User();
	
	/**
	 * UC-1 Method to validate first name
	 * @param Name
	 * @return
	 */	
	public static void getFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName= sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
		if(check) {
			user.setFirstName(firstName);
		}
		else {
			System.out.println("First name start with capital letter");
			getFirstName();
		}
	}
	
	/**
	 * UC-1 Method to validate first name
	 * @param Name
	 * @return
	 */	
	public static void getLastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last name");
		String lastName= sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
		if(check) {
			user.setFirstName(lastName);
		}
		else {
			System.out.println("Last name start with capital letter");
			getFirstName();
		}
	}
	
	public static void main(String[] args) {
		
		getFirstName();
		getLastName();
	}

}
