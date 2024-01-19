package com.ilp.entity;

import java.util.ArrayList;

public class Account {
    private String accountId;
    private SubscriptionType subscriptionType;
    private ArrayList<Profiles> profiles=new ArrayList<Profiles>();

    public Account(String accountId, SubscriptionType subscriptionType, ArrayList<Profiles> profiles) {
        this.accountId = accountId;
        this.subscriptionType = subscriptionType;
        this.profiles = profiles;
    }

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public ArrayList<Profiles> getProfiles() {
		return profiles;
	}

	public void setProfiles(ArrayList<Profiles> profiles) {
		this.profiles = profiles;
	}

  
}




