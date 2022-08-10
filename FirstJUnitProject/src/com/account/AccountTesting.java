package com.account;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountTesting {
	   private String input;
	   private Boolean expectedResult;
	   private AccountNameValidate accountNameValidate;

	   @Before
	   public void initialize() {
		   accountNameValidate = new AccountNameValidate();
	   }
		
	   public AccountTesting(String inputNumber, Boolean expectedResult) {
	      this.input = inputNumber;
	      this.expectedResult = expectedResult;
	   }

	   @Parameterized.Parameters
	   public static Collection accountNames() {
	      return Arrays.asList(new Object[][] {
	         { "Exalt_2", true },
	         { "EEEEE6", false },
	         { "Exalt_19", true },
	         { "Exlt_22", false },
	         { "Exalt_23", true }
	      });
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testAccountNameValidator() {
	      assertEquals(expectedResult, 
    		  accountNameValidate.validate(input));
	   }
	

}
