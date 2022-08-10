package com.account;

import java.util.List;

public class Account {
	
	// start with a number and ends with PS
	private String accountCode;
	// start with EXALT_
	private String accountName;
	private List<AccountTransaction> accountTransactions;
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public List<AccountTransaction> getAccountTransactions() {
		return accountTransactions;
	}
	public void setAccountTransactions(List<AccountTransaction> accountTransactions) {
		this.accountTransactions = accountTransactions;
	}
	
}
