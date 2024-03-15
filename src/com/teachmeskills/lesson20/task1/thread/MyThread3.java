package com.teachmeskills.lesson20.task1.thread;

/**
 * Action Simulation Class
 */
public class MyThread3 extends Thread{

    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        doSomething();
    }


    private void doSomething(){
        System.out.println("Sleeping...");
    }
}
