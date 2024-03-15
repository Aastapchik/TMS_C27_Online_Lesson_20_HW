package com.teachmeskills.lesson20.task3.customer;

import com.teachmeskills.lesson20.task3.serviceStation.ServiceStation;

/**
 * Customer imitation class
 */
public class Customer extends Thread{
    public ServiceStation serviceStation;
    public Customer(ServiceStation serviceStation){
        this.serviceStation = serviceStation;
    }
    @Override
    public void run() {
        serviceStation.order(serviceStation);
    }




}
