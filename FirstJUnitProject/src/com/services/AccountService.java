package com.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.account.Account;
import com.account.AccountTesting;
import com.account.AccountTransaction;
import com.dummydata.DummyDataGenerator;

import test.suites.TestSuite1;

public class AccountService {
	
	public static Account getAccountDetails(){
		return DummyDataGenerator.getDummyDataGenerator();
	}

	public List<Account> getListOfAccounts() {
		List<Account> listOfAccounts = new ArrayList<Account>();
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator());
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator());
		listOfAccounts.add(DummyDataGenerator.getDummyDataGenerator());
		return listOfAccounts;
		
	}
	
	public List<AccountTransaction> getAccountTransactions(Account account){
		return DummyDataGenerator.getDummyDataGenerator().getAccountTransactions();
	}

	public static void main(String []args) {

		getAccountDetails();
	      Result result = JUnitCore.runClasses(TestSuite1.class);
	      for (Failure failure : result.getFailures()) {
	          System.out.println("Failed: "+failure.toString());
	       }
	 		
	       System.out.println("Tested successfully? "+result.wasSuccessful());
	}
}
