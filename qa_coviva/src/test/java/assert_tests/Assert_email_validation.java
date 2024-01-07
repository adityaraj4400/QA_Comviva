package assert_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import emailvalid.emailvalid;

	public class Assert_email_validation {
		@Test

		public void emailtest() {
			EmailValidator obj= new EmailValidator();

			assertTrue(obj.isValidEmail("adityaraj@gmail.com"));
			assertFalse(obj.isValidEmail("aditya.com")); 
			assertFalse(obj.isValidEmail("aditya@gmail"));	
			assertFalse(obj.isValidEmail(""));
		}

		@Test

		public void companyemailtest() {
			EmailValidator obj= new EmailValidator();

			assertTrue(obj.isCorporateEmail("aditya@company.com")); 
			assertFalse(obj.isCorporateEmail("aditya@company"));
			assertFalse(obj.isCorporateEmail("adityacompany.com"));
			assertTrue(obj.isCorporateEmail("adi@company.com"));
			
		}
}
	

