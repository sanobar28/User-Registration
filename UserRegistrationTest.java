package regexpattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	/**
	 * Test cases for first name
	 */
	@Test
	public void givenValidFirstName_shouldReturnTrue() {

		boolean name = userRegistration.getFirstName("Sanobar");
		assertTrue(name);

	}

	@Test
	public void givenFirstName_whenMinimumThreeCharacter_shouldReturnTrue() {
		boolean name = userRegistration.getFirstName("San");
		assertTrue(name);
	}

	@Test
	public void givenFirstName_LessThanThreecharacter_shouldReturnFalse() {
		boolean name = userRegistration.getFirstName("Sa");
		assertFalse(name);
	}

	@Test
	public void givenInvalidFirstName_WithSmallChar_shouldReturnfalse() {

		boolean name = userRegistration.getFirstName("sanobar");
		assertFalse(name);
	}

	@Test
	public void givenFirstName_whenAllUpperCaseCharacter_shouldReturnFalse() {
		boolean name = userRegistration.getFirstName("SANOBAR");
		assertFalse(name);
	}

	@Test
	public void givenFirstName_whenContainNumber_shouldReturnFalse() {
		boolean name = userRegistration.getFirstName("Sa784nk");
		assertFalse(name);
	}

	@Test
	public void givenFirstName_whenContainSpecialChars_shouldReturnFalse() {
		boolean name = userRegistration.getFirstName("Sano@bar");
		assertFalse(name);
	}

	/**
	 * Test cases for email ID
	 *
	 */

	@Test
	public void givenEmailId_whenProper_shouldReturnTrue() {
		boolean emailId = userRegistration.getEmail("sanobar.mujawar@gmail.com");
		assertTrue(emailId);
	}

	@Test
	public void givenEmailId_whenContainSymbol_shouldReturnTrue() {
		boolean emailId = userRegistration.getEmail("sanobar.123@gmail.com");
		assertTrue(emailId);
	}

	@Test
	public void givenEmailId_whenContainLessThanThreeCharacter_shouldReturnFalse() {
		boolean emailId = userRegistration.getEmail("sa@gmail.com");
		assertFalse(emailId);
	}

	@Test
	public void givenEmailId_whenNotContainGmailPart_shouldReturnFalse() {
		boolean emailId = userRegistration.getEmail("sanobar@.com");
		assertFalse(emailId);
	}

	@Test
	public void givenEmailId_whenNotContainComPart_shouldReturnFalse() {
		boolean emailId = userRegistration.getEmail("sanobar@gmail");
		assertFalse(emailId);
	}

	@Test
	public void givenEmailID_havingContinuousDots_shouldReturnFalse() {
		boolean emailId = userRegistration.getEmail("abc..28@gmail.com");
		assertFalse(emailId);
	}

	@Test
	public void givenEmailID_lasTLDmustcontainAtLeast2char_shouldReturnFalse() {
		boolean emailId = userRegistration.getEmail("abc123@gmail.c");
		assertFalse(emailId);
	}

	@Test
	public void givenEmailID_DoubleAtSymbol_shouldReturnFalse() {
		boolean emailId = userRegistration.getEmail("abc@abc@gmail.com");
		assertFalse(emailId);
	}

	@Test
	public void givenEmailID_DotAtStart_shouldReturnFalse() {
		boolean emailId = userRegistration.getEmail(".abc@abc@gmail.com");
		assertFalse(emailId);
	}

	@Test
	public void givenEmailID_MultipleTopLevelDomain_AtEnd_shouldReturnFalse() {
		boolean emailId = userRegistration.getEmail("abc@gmail.com.aa.au");
		assertFalse(emailId);
	}

	/**
	 * Test cases for Mobile Numbers.
	 */

	@Test
	public void givenMobileNumber_whenProper_shouldReturnTrue() {
		boolean mobileNumber = userRegistration.getMobileNumber("+91-7676878789");
		assertTrue(mobileNumber);
	}

	@Test
	public void givenMobileNumber_whenLessThanTenDigit_shouldReturnFalse() {
		boolean mobileNumber = userRegistration.getMobileNumber("+91-767687");
		assertFalse(mobileNumber);
	}

	@Test
	public void givenMobileNumber_whenContainsSpace_shouldReturnTrue() {
		boolean mobileNumber = userRegistration.getMobileNumber("+91 7676876754");
		assertTrue(mobileNumber);
	}

	@Test
	public void givenMobileNumber_whenContainsOtherThen_SpaceHyphenandPlusSymbol_shouldReturnFalse() {
		boolean mobileNumber = userRegistration.getMobileNumber("+91@7676876754");
		assertFalse(mobileNumber);
	}

	@Test
	public void givenMobileNumber_whenNoCountryCode_shouldReturnFalse() {
		boolean mobileNumber = userRegistration.getMobileNumber("234878789");
		assertFalse(mobileNumber);
	}

	@Test
	public void givenMobileNumber_whengreaterthanTen_shouldReturnFalse() {
		boolean mobileNumber = userRegistration.getMobileNumber("+91-85432786534");
		assertFalse(mobileNumber);
	}

	@Test
	public void givenMobileNumber_whenSpecialCharacterGiven_shouldReturnFalse() {
		boolean mobileNumber = userRegistration.getMobileNumber("+91 76768@786");
		assertFalse(mobileNumber);
	}

	@Test
	public void givenMobileNumber_whencharactersCharacterGiven_shouldReturnFalse() {
		boolean mobileNumber = userRegistration.getMobileNumber("+91 76768a3786");
		assertFalse(mobileNumber);
	}

	/**
	 * Test cases for password
	 *
	 */
	@Test
	public void givenPassword_whenProper_shouldReturnTrue() {
		boolean password = userRegistration.getPassword("@Sana123");
		assertTrue(password);
	}

	@Test
	public void givenPassword_whenLessThanEightCharacter_shouldReturnFalse() {
		boolean password = userRegistration.getPassword("Sana@12");
		assertFalse(password);
	}

	@Test
	public void givenPassword_whenNotContainUpperCase_shouldReturnFalse() {
		boolean password = userRegistration.getPassword("sana2803#");
		assertFalse(password);
	}

	@Test
	public void givenPassword_whenNotContainNumber_shouldReturnFalse() {
		boolean password = userRegistration.getPassword("sanaSH#W");
		assertFalse(password);
	}

	@Test
	public void givenPassword_whenContainNoSpecialCharacter_shouldReturnFalse() {
		boolean password = userRegistration.getPassword("Sana45eh");
		assertFalse(password);
	}
}