package com.account;

public class AccountTransaction {
	
	// BUY or SELL
	private String transactionType;
	// max value 100
	private int amount;
	
	private String clientAccount;
	
	public AccountTransaction(String clientAccount, String transactionType, int amount) {
		this.setClientAccount(clientAccount);
		this.setAmount(amount);
		this.setTransactionType(transactionType);
	}
	public String getClientAccount() {
		return this.clientAccount;
	}
	
	public void setClientAccount(String clientAccount) {
		this.clientAccount = clientAccount;
	}
	
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
