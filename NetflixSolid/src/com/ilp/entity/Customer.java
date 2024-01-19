package com.ilp.entity;

public class Customer {
    private String customerId;
    private String customerName;
    private Account account;

    public Customer(String customerId, String customerName, Account account) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.account = account;
    }

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}