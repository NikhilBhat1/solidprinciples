package com.ilp.utility;

import com.ilp.entity.BasicSubscription;
import com.ilp.interfaces.Subscription;

public class SubscriptionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Subscription subscription=new BasicSubscription();

	   
		 System.out.println("subscriptiontype=" + subscription.getName());

	}

}