/**
 * This is runtime exception handler class which throws 
 * custom exception message
 */

package regexpattern;

public class UserRegistrationException extends RuntimeException {
	
	public UserRegistrationException(String message) {
        super(message);
    }

}
