package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.account.Account;
import com.account.AccountTransaction;
import com.services.AccountService;

public class transactionsTest {
	Account ac = AccountService.getAccountDetails();
	List<AccountTransaction> acTransactions= ac.getAccountTransactions();	
	List<String> transactionTypes = Arrays.asList("BUY", "SELL");
	
	@Test
	public void transTypeValidation() {
		assertTrue(transactionTypes.contains(acTransactions.get(1).getTransactionType()));
	}
	
	@Test
	public void transAmountValidation() {
		assertTrue(acTransactions.get(1).getAmount() < 100);
	}
	
	@Test
	public void getAccountTransactionsTest() {

		Account client1 = new Account();
		client1.setAccountCode((new Random(System.currentTimeMillis()).nextInt(100000) + "PS").toString());
		client1.setAccountName("Exalt_" + System.currentTimeMillis());
		
		Account client2 = new Account();
		client2.setAccountCode((new Random(System.currentTimeMillis()).nextInt(100000) + "PS").toString());
		client2.setAccountName("Exalt_" + System.currentTimeMillis());
		
		AccountTransaction accountTransaction1 = new AccountTransaction(client1.getAccountCode(),
				"BUY", new Random(System.currentTimeMillis()).nextInt(100));
		AccountTransaction accountTransaction2 = new AccountTransaction(client2.getAccountCode(),
				"SEL", new Random(System.currentTimeMillis()).nextInt(100));
		
		List<AccountTransaction> listOfAccountTransaction = new ArrayList<AccountTransaction>();
		listOfAccountTransaction.add(accountTransaction1);
		listOfAccountTransaction.add(accountTransaction2);
		ac.setAccountTransactions(listOfAccountTransaction);
		
		assertEquals(ac.getAccountTransactions(), listOfAccountTransaction);
	}

}
