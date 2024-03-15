package com.teachmeskills.lesson20.task3.serviceStation;

import com.teachmeskills.lesson20.task3.constants.Constants;

/**
 * Class imitation of service work
 */
public class ServiceStation {


    public int numCar;

    public ServiceStation(int numCar) {
        this.numCar = numCar;
    }

    public synchronized void order(ServiceStation serviceStation){
        while(serviceStation.numCar < Constants.SIZE_OF_SERVICE_STATION){
            System.out.println("Приехала машина на ремонт. Теперь их " + ++serviceStation.numCar);
        }
        notify();
    }

    public synchronized void work(ServiceStation serviceStation){
        while(serviceStation.numCar > -1) {
            System.out.println("Ремонт. Осталось "+ serviceStation.numCar + " машин.");
            serviceStation.numCar--;
        }
        notify();
    }

}
