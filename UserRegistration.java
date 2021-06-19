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
	static Scanner sc = new Scanner(System.in);
	String regPattern = "^[A-Z]{1}[a-z]{2,}$";

	/**
	 * UC-1 Method to validate first name
	 */
	public static boolean getFirstName() { 
		System.out.println("Enter first name");
		String firstNmae = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstNmae);
		if (check) {
			user.setFirstName(firstNmae);
		} else {
			System.out.println("Invalid first name");
			getFirstName();
		}
		return false;
	}

	/**
	 * UC-2 Method to validate Last name
	 */
	public static boolean getLastName() { 
		
		System.out.println("Enter Last name");
		String lastName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
		if (check) {
			user.setLastName(lastName);
		} else {
			System.out.println("Invalid last name");
			getLastName();
		}
		return false;
	}

	/**
	 * UC-3 Method to validate Email ID
	 */
	public static boolean getEmail() {
		
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
		return false;
	}

	/**
	 * UC-4 Method to validate Mobile number with country code
	 */
	public static boolean getMobileNumber() {
		
		System.out.println("Enter Mobile Number");
		String phoneNo = sc.next();
		boolean check = Pattern.matches("^(\\+91)[7-9][0-9]{9}$", phoneNo);
		if (check) {
			user.setMobileNumber(phoneNo);
		} else {
			System.out.println("Invalid Mobile No.");
			getMobileNumber();
		}
		return false;
	}

	/**
	 * UC-5 Password Rule No.1- It should contain at least 8 characters 
	 * UC-6 Password Rule No.2- It should contain at least one Upper case 
	 * UC-7 Password Rule No.3- It should contain at least one number 
	 * UC-8 Password Rule No.4- It should contain exact one special character
	 * 
	 */
	public static boolean getPassword() {
		
		System.out.println("Enter Password");
		String password = sc.next();
		boolean check = Pattern.matches(
				"^((?=[^@|#|&|%|*]*[@|&|#|%|*][^@|#|&|%|*]*$)(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@#$%&*]{8,})$", password);
		if (check) {
			user.setMobileNumber(password);
		} else {
			System.out.println("Password should contain at least 8 character");
			System.out.println("Password should contain at least one Upper case");
			System.out.println("Password should contain at least one number");
			System.out.println("Password should contain exact one special character");
			getPassword();
		}
		return false;
	}

	public static void main(String[] args) {

		getFirstName();
		getLastName();	
		getEmail();
		getMobileNumber();
		getPassword();
	}

}
