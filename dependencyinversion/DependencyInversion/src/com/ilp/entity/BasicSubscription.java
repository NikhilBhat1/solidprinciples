package com.ilp.entity;

import com.ilp.interfaces.Subscription;
import com.ilp.utility.SubscriptionType;

public class BasicSubscription extends SubscriptionType implements Subscription {
    

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Basic";
	}

	@Override
	public int getprice() {
		// TODO Auto-generated method stub
		return 199;
	}

}
 