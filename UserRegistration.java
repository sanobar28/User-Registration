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
	 */
	public static void getFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
		if (check) {
			user.setFirstName(firstName);
		} else {
			System.out.println("First name start with capital letter");
			getFirstName();
		}
	}

	/**
	 * UC-2 Method to validate Last name
	 */
	public static void getLastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last name");
		String lastName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
		if (check) {
			user.setLastName(lastName);
		} else {
			System.out.println("Last name start with capital letter");
			getLastName();
		}
	}

	/**
	 * UC-3 Method to validate Email ID
	 */
	public static void getEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email ID");
		String emailID = sc.next();
		boolean check = Pattern.matches(
				"^([a-z]{2,}[0-9a-z]{1,}([_+-.*$#]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$",
				emailID);
		if (check) {
			user.setEmail(emailID);
		} else {
			System.out.println("Invalid email");
			getEmail();
		}
	}

	/**
	 * UC-4 Method to validate Mobile number
	 */
	public static void getMobileNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		String phoneNo = sc.next();
		boolean check = Pattern.matches("^[7-9][0-9]{9}$", phoneNo);
		if (check) {
			user.setMobileNumber(phoneNo);
		} else {
			System.out.println("Invalid Mobile No.");
			getMobileNumber();
		}
	}

	public static void main(String[] args) {

		getFirstName();
		getLastName();
		getEmail();
		getMobileNumber();
	}

}
