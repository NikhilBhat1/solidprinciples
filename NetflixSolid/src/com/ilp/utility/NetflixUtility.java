package com.ilp.utility;
import java.util.ArrayList;
import com.ilp.services.*;
import com.ilp.entity.*;

public class NetflixUtility {

	    public static void main(String[] args) {
	        // Creating profiles
	        Profiles profile1 = new Profiles("1", "Profile1");
	        Profiles profile2 = new Profiles("2", "Profile2");

	        // Creating subscription type
	        SubscriptionType standardSubscription = new StandardSubscription(3);
	        	
	        // Creating account with multiple profiles and the subscription type
	        ArrayList<Profiles> profiles = new ArrayList<>();
	        profiles.add(profile1);
	        profiles.add(profile2);

	        Account account = new Account("A1", standardSubscription, profiles);

	        // Creating a customer with the account
//	        ArrayList<Account> customerAccounts = new ArrayList<>();
//	        customerAccounts.add(account);
	        Customer customer = new Customer("C1", "Customer1", account);

	        // Displaying information
	        DisplayCustomer.displayCustomerInfo(customer);
	       
	    }
}



	    