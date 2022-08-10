package Tests;
import static org.junit.Assert.*;

import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.account.Account;
import com.account.AccountTransaction;
import com.services.AccountService;

public class accountTest {
	Account ac = AccountService.getAccountDetails();
	String acName = ac.getAccountName();
	String acCode= ac.getAccountCode();	
	List<AccountTransaction> acTransactions= ac.getAccountTransactions();	
	
	public boolean isNumeric(String strNum) {
		  boolean amIValid = false;
		  try {
		   Integer.parseInt(strNum);
		   amIValid = true;
		  } catch (NumberFormatException e) {
		  }
		  return amIValid;
	}
	
	@Test
	public void accountNameValidation() {
		assertEquals(acName.substring(0,6), "Exalt_");
	}
	
	@Test
	public void accountCodeValidation() {
		assertTrue(isNumeric(acCode.substring(0,acCode.length() - 2)) &&
				acCode.substring(acCode.length() - 2).equals("PS"));
	}
	
	@Test
	public void setAccountCodeTest() {
		ac.setAccountCode("99999PS");
		assertEquals(ac.getAccountCode(), "99999PS");
	}
	

}
