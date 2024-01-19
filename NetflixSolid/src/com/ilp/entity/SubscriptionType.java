package com.ilp.entity;

import com.ilp.interfaces.Subscription;


public abstract class SubscriptionType implements Subscription {
    private int deviceLimit;

    public SubscriptionType(int deviceLimit) {
        this.deviceLimit = deviceLimit;
    }

    public int getDeviceLimit() {
        return deviceLimit;
    }
    
//    public void stream1080pVideo() {
//    }
    
}