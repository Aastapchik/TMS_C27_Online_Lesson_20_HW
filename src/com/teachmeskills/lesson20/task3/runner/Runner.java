package com.teachmeskills.lesson20.task3.runner;

import com.teachmeskills.lesson20.task3.customer.Customer;
import com.teachmeskills.lesson20.task3.serviceStation.ServiceStation;
import com.teachmeskills.lesson20.task3.executor.Executor;
/**
 * Program imitation class
 */
public class Runner {
    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation(5);

       Thread threads1 = new Executor(serviceStation);
        threads1.start();

        Thread thread2 = new Customer(serviceStation);
        thread2.start();
    }


}
