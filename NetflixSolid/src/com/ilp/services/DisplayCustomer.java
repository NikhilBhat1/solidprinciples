package com.ilp.services;

import com.ilp.entity.Account;
import com.ilp.entity.Customer;
import com.ilp.entity.Profiles;
import com.ilp.entity.StandardSubscription;

public class DisplayCustomer {
	public static void displayCustomerInfo(Customer customer) {
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getCustomerName());

        // Accessing the single account directly without using a loop
        Account account = customer.getAccount();
        System.out.println("Account ID: " + account.getAccountId());
        System.out.println("Subscription Type: " + account.getSubscriptionType().getSubscriptionName());

        System.out.println("Profiles:");
        for (Profiles profile : account.getProfiles()) {
            System.out.println("  Profile ID: " + profile.getProfileId());
            System.out.println("  Profile Name: " + profile.getProfileName());
        }

        // Streaming video based on the subscription type
        
 
//        account.getSubscriptionType().stream1080pVideo();
        
        if(account.getSubscriptionType() instanceof StandardSubscription) {
        	StandardSubscription std = (StandardSubscription) account.getSubscriptionType();
        	std.stream1080pVideo();
        }

        System.out.println("---------------------------");
    }
}

