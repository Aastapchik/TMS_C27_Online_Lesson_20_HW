package com.teachmeskills.lesson20.task3.executor;

import com.teachmeskills.lesson20.task3.serviceStation.ServiceStation;

/**
 * Executor imitation class
 */
public class Executor extends Thread{
    public ServiceStation serviceStation;
    public Executor(ServiceStation serviceStation){
        this.serviceStation = serviceStation;
    }
    @Override
    public void run() {
        serviceStation.work(serviceStation);
    }



}
