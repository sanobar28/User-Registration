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

	/**
	 * UC-1 UC-2 Method to validate first name and last name
	 * 
	 * Added custom exception handler with try catch to handle invalid inputs.
	 */
	public boolean getFirstName(String name) {

		boolean match;
		match = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", name);
		if (!match) {

			ErrorMessage("Invalid Name");
		}
		return match;
	}

	/**
	 * UC-3 Method to validate Email ID
	 * 
	 * Added custom exception handler with try catch to handle invalid inputs.
	 */
	public boolean getEmail(String email) {

		boolean match;
		match = Pattern.matches(
				"^([a-z]{2,}[0-9a-z]{1,}([_+-.*$#]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$",
				email);
		if (!match) {

			ErrorMessage("Invalid Email");
		}
		return match;
	}

	/**
	 * UC-4 Method to validate Mobile number with country code
	 * 
	 * Added custom exception handler with try catch to handle invalid inputs.
	 */
	public boolean getMobileNumber(String phoneNumber) {

		boolean match;
		match = Pattern.matches("^[\\+?][9?][1?][\\s\\-?][\\d]{10}", phoneNumber);
		if (!match) {

			ErrorMessage("Invalid Mobile No. ");
		}
		return match;

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
	public boolean getPassword(String password) {

		boolean match;
		match = Pattern.matches("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$", password);
		if (!match) {

			ErrorMessage("Invalid Password ");
		}
		return match;

	}

	/**
	 * UC-13 Lambda function to validate user input
	 * 
	 * @param message
	 */
	public void ErrorMessage(String message) {

		ILambdaValidation i = () -> System.out.println(message);
		i.ErrorMessage();
	}
}
