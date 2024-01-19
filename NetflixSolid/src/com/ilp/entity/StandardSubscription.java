package com.ilp.entity;
import com.ilp.interfaces.*;

public class StandardSubscription extends SubscriptionType implements  VideoStreaming{
	public StandardSubscription(int deviceLimit) {
        super(deviceLimit);
    }

	@Override
	public String getSubscriptionName() {
		// TODO Auto-generated method stub
		return "standard";
	}
 
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 199;
	}

	@Override
	public void stream1080pVideo() {
		// TODO Auto-generated method stub
		System.out.println("1080p streaming");
		
	}
	
	

}
