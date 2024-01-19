package com.ilp.entity;

import com.ilp.interfaces.VideoStreaming;

public class PremiumSubscription extends SubscriptionType implements VideoStreaming {
	public PremiumSubscription(int deviceLimit) {
        super(deviceLimit);
    }

	@Override
	public String getSubscriptionName() {
		// TODO Auto-generated method stub
		return "premium";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 249;
	}
	@Override
    public void stream1080pVideo() {
        System.out.println("Streaming 1080p video");
    }

}
