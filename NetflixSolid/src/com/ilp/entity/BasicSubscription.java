package com.ilp.entity;

public class BasicSubscription extends SubscriptionType {
	public BasicSubscription(int deviceLimit) {
        super(deviceLimit);
    }


	@Override
	public String getSubscriptionName() {
		// TODO Auto-generated method stub
		return "Basic";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 149;
	}

}
