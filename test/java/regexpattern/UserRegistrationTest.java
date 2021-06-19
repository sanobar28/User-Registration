package regexpattern;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration testObject = new UserRegistration();

	/**
	 * Test cases for first name
	 */
	@Test
	public void givenValidFirstName_shouldReturnTrue() {
		boolean firstName = UserRegistration.getFirstName();
		Assert.assertTrue("Sanobar", firstName);
	}

	@Test
	public void givenFirstName_whenMinimumThreeCharacter_shouldReturnTrue() {
		boolean firstName =UserRegistration.getFirstName();
		Assert.assertTrue("San", firstName);
	}

	@Test
	public void givenInvalidFirstName_shouldReturnFalse() {
		boolean firstName = UserRegistration.getFirstName();
		Assert.assertFalse("Sa", firstName);
	}

	@Test
	public void givenInvalidFirstName_WithSmallChar_shouldReturnfalse() {

		boolean firstName = UserRegistration.getFirstName();
		Assert.assertFalse("sanobar", firstName);
	}
	
	@Test
	public void givenInvalidFirstName_WithonlyOneChar_shouldReturnfalse() {

		boolean firstName = UserRegistration.getFirstName();
		Assert.assertFalse("S", firstName);
	}

	@Test
	public void givenFirstName_whenAllUpperCaseCharacter_shouldReturnFalse() {
		boolean firstName = UserRegistration.getFirstName();
		Assert.assertFalse("SANOBAR", firstName);
	}

	@Test
	public void givenFirstName_whenContainNumber_shouldReturnFalse() {
		boolean firstName = UserRegistration.getFirstName();
		Assert.assertFalse("San478", firstName);
	}

	
	/**
	 * Test cases for Last name
	 */
	@Test
	public void givenValidLastName_shouldReturnTrue() {
		boolean lastname = UserRegistration.getLastName();
		Assert.assertTrue("Mujawar", lastname);
	}

	@Test
	public void givenLastName_whenMinimumThreeCharacter_shouldReturnTrue() {
		boolean lastname =UserRegistration.getLastName();
		Assert.assertTrue("Muj",lastname);
	}

	@Test
	public void givenInvalidLastName_shouldReturnFalse() {
		boolean lastname = UserRegistration.getLastName();
		Assert.assertFalse("Mu", lastname);
	}

	@Test
	public void givenInvalidLastName_WithSmallChar_shouldReturnfalse() {

		boolean lastname = UserRegistration.getLastName();
		Assert.assertFalse("mujawar", lastname);
	}
	
	@Test
	public void givenInvalidLastName_WithonlyOneChar_shouldReturnfalse() {

		boolean lastname = UserRegistration.getLastName();
		Assert.assertFalse("M", lastname);
	}

	@Test
	public void givenLastName_whenAllUpperCaseCharacter_shouldReturnFalse() {
		boolean lastname = UserRegistration.getLastName();
		Assert.assertFalse("MUJAWAR", lastname);
	}

	@Test
	public void givenLastName_whenContainNumber_shouldReturnFalse() {
		boolean lastname = UserRegistration.getLastName();
		Assert.assertFalse("Muja478", lastname);
	}

	/**
	 * Test cases for email ID
	 * 
	 */
	 @Test
	    public void givenEmailId_whenProper_shouldReturnTrue() {
	        boolean emailId =UserRegistration.getEmail();
	        Assert.assertTrue("sanobarmujawar28@gmail.com", emailId);
	    }

	    @Test
	    public void givenEmailId_whenContainSymbol_shouldReturnTrue() {
	        boolean emailId = UserRegistration.getEmail();
	        Assert.assertTrue("sanobar.mujawar28@gmail.com", emailId);
	    }

	    @Test
	    public void givenEmailId_whenContainLessThanThreeCharacter_shouldReturnFalse() {
	        boolean emailId = UserRegistration.getEmail();
	        Assert.assertFalse("sa@gmail.com", emailId);
	    }

	    @Test
	    public void givenEmailId_whenNotContainGmailPart_shouldReturnFalse() {
	        boolean emailId = UserRegistration.getEmail();
	        Assert.assertFalse("sana@.com", emailId);
	    }

	    @Test
	    public void givenEmailId_whenNotContainComPart_shouldReturnFalse() {
	        boolean emailId = UserRegistration.getEmail();
	        Assert.assertFalse("sana@gmail", emailId);
	    }
	    
	    @Test
	    public void givenEmailID_havingContinuousDots_shouldReturnFalse() {
	    	boolean emailId = UserRegistration.getEmail();
	        Assert.assertFalse("sana..28@gmail.com", emailId);
	    }
	
	    @Test
	    public void givenEmailID_lasTLDmustcontainAtLeast2char_shouldReturnFalse() {
	    	boolean emailId = UserRegistration.getEmail();
	        Assert.assertFalse("abc123@gmail.a", emailId);
	    }
	    
	    @Test
	    public void givenEmailID_DoubleAtSymbol_shouldReturnFalse() {
	    	boolean emailId = UserRegistration.getEmail();
	        Assert.assertFalse("abc@abc@gmail.com", emailId);
	    }
	    
	    /**
	     * Test cases for mobile no.
	     */
	    
	    @Test
	    public void givenMobileNumber_whenProper_shouldReturnTrue() {
	        boolean mobNumber = UserRegistration.getMobileNumber();
	        Assert.assertTrue("+917676878789", mobNumber);
	    }

	    @Test
	    public void givenMobileNumber_whenLessThanTenDigit_shouldReturnFalse() {
	    	boolean mobNumber = UserRegistration.getMobileNumber();
	        Assert.assertFalse("+91767687", mobNumber);
	    }
	    
	    @Test
	    public void givenMobileNumber_whenContainsSpace_shouldReturnFalse() {
	    	boolean mobNumber = UserRegistration.getMobileNumber();
	        Assert.assertFalse("+91 7676876754", mobNumber);
	    }

	    @Test
	    public void givenMobileNumber_whenNoCountryCode_shouldReturnFalse() {
	    	boolean mobNumber = UserRegistration.getMobileNumber();
	        Assert.assertFalse("234878789", mobNumber);
	    }

	    @Test
	    public void givenMobileNumber_whengreaterthanTen_shouldReturnFalse() {
	    	boolean mobNumber = UserRegistration.getMobileNumber();
	        Assert.assertFalse("577854327865", mobNumber);
	    }

	    @Test public void givenMobileNumber_whenSpecialCharacterGiven_shouldReturnFalse() {
	    	boolean mobNumber = UserRegistration.getMobileNumber();
	        Assert.assertFalse("+91 76768@786", mobNumber);
	    }
	    
	    
	    /**
	     * Test cases for password 
	     * 
	     */
	    
	    @Test
	    public void givenPassword_whenProper_shouldReturnTrue() {
	    	boolean password = UserRegistration.getPassword();
	        Assert.assertTrue("@Sana123", password);
	    }
	    @Test
	    public void givenPassword_whenLessThanEightCharacter_shouldReturnFalse() {
	    	boolean password = UserRegistration.getPassword();
	        Assert.assertFalse("sana12", password);
	    }

	    @Test
	    public void givenPassword_whenAtLeastOneUpperCase_shouldReturnTrue() {
	    	boolean password = UserRegistration.getPassword();
	        Assert.assertTrue("sAna@123", password);
	    }
	    @Test
	    public void givenPassword_whenNotContainUpperCase_shouldReturnFalse() {
	    	boolean password = UserRegistration.getPassword();
	        Assert.assertFalse("@sana123", password);
	    }

	    @Test
	    public void givenPassword_whenAtLeastOneNumericNumber_shouldReturnTrue() {
	    	boolean password = UserRegistration.getPassword();
	        Assert.assertTrue("1@Sanobar", password);
	    }
	    @Test
	    public void givenPassword_whenNotContainNumber_shouldReturnFalse() {
	    	boolean password = UserRegistration.getPassword();
	        Assert.assertFalse("MujawarSANOBAR", password);
	    }

	    @Test
	    public void givenPassword_whenExactlyOneSpecialCharacter_shouldReturnTrue() {
	    	boolean password = UserRegistration.getPassword();
	        Assert.assertTrue("@Sana123", password);
	    }

	    @Test
	    public void givenPassword_whenNotContainMoreThanOneSpecialChar_shouldReturnFalse() {
	    	boolean password = UserRegistration.getPassword();
	        Assert.assertFalse("Sana1@#", password);
	    }	
}
