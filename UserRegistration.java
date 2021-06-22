/**
 * 
 * @author Sanobar Mujawar
 * @since 18.06.21
 * 
 * Purpose: To validate user input using regex
 * 
 */

package regexpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

	static User user = new User();
	static Scanner sc = new Scanner(System.in);

	/**
	 * UC-1 UC-2 Method to validate first name and last name
	 * 
	 * Added custom exception handler with try catch to handle invalid inputs.
	 */
	public void validateUserName(String name) {

		try {
			Pattern pattern = Pattern.compile(("^[A-Z]{1}[a-z]{2,}"));
			Matcher matcher = pattern.matcher(name);
			boolean match = matcher.matches();

			if (match) {
				System.out.println("name is valid");
			} else {
				throw new UserRegistrationException("Invalid Input");
			}
		} catch (UserRegistrationException | NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * UC-3 Method to validate Email ID
	 * 
	 * Added custom exception handler with try catch to handle invalid inputs.
	 */
	public void validateUserEmail(String email) {

		try {
			Pattern pattern = Pattern.compile(
					("^([a-z]{2,}[0-9a-z]{1,}([_+-.*$#]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$"));
			Matcher matcher = pattern.matcher(email);
			boolean match = matcher.matches();

			if (match) {
				System.out.println("email is valid");
			} else {
				throw new UserRegistrationException("Invalid Input");
			}
		} catch (UserRegistrationException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * UC-4 Method to validate Mobile number with country code
	 * 
	 * Added custom exception handler with try catch to handle invalid inputs.
	 */
	public void validateUserPhoneNumber(String phoneNumber) {

		try {
			Pattern pattern = Pattern.compile(("^[\\+?][9?][1?][\\s\\-?][\\d]{10}"));
			Matcher matcher = pattern.matcher(phoneNumber);
			boolean match = matcher.matches();
			if (match) {
				System.out.println(" phone number is valid");
			} else {
				throw new UserRegistrationException("Invalid Input");
			}
		} catch (UserRegistrationException | NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * UC-5 Password Rule No.1- It should contain at least 8 characters UC-6
	 * Password Rule No.2- It should contain at least one Upper case UC-7 Password
	 * Rule No.3- It should contain at least one number UC-8 Password Rule No.4- It
	 * should contain exact one special character
	 * 
	 * 
	 * Added custom exception handler with try catch to handle invalid inputs.
	 */
	public void validateUserPassword(String password) {

		// defining pattern and matcher class for validation
		try {
			Pattern pattern = Pattern.compile("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
			Matcher matcher = pattern.matcher(password);
			boolean match = matcher.matches();
			if (match) {
				System.out.println("Password is Valid");
			} else {
				throw new UserRegistrationException("Invalid Input");
			}
		} catch (UserRegistrationException | NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}
}
