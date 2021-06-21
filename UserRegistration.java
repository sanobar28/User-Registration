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
	 */
	public boolean getFirstName(String name) {

		Pattern pattern = Pattern.compile(("^[A-Z]{1}[a-z]{2,}"));
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}

	/**
	 * UC-3 Method to validate Email ID
	 */
	public boolean getEmail(String email) {

		Pattern pattern = Pattern.compile(
				("^([a-z]{2,}[0-9a-z]{1,}([_+-.*$#]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$"));
		Matcher matcher = pattern.matcher(email);
		boolean matches = matcher.matches();

		return matches;
	}

	/**
	 * UC-4 Method to validate Mobile number with country code
	 */
	public boolean getMobileNumber(String phoneNumber) {

		Pattern pattern = Pattern.compile(("^[\\+?][9?][1?][\\s\\-?][\\d]{10}"));
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean matches = matcher.matches();

		return matches;
	}

	/**
	 * UC-5 Password Rule No.1- It should contain at least 8 characters UC-6
	 * Password Rule No.2- It should contain at least one Upper case UC-7 Password
	 * Rule No.3- It should contain at least one number UC-8 Password Rule No.4- It
	 * should contain exact one special character
	 * 
	 */
	public boolean getPassword(String password) {

		Pattern pattern = Pattern.compile("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");
		Matcher matcher = pattern.matcher(password);
		boolean matches = matcher.matches();
		return matches;
	}

}
