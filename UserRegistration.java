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

public class UserRegistration {

	String regPattern = "^[A-Z][a-z]{2,}$";

	/**
	 * UC-1 Method to validate first name
	 * @param firstName
	 * @return
	 */
	public boolean validation(String firstName) { 

		return Pattern.matches(regPattern, firstName);
	}

}
