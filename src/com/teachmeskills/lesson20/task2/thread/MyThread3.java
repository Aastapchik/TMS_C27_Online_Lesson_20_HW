package com.teachmeskills.lesson20.task2.thread;

/**
 * Action Simulation Class
 */
public class MyThread3 implements Runnable{

    private String name;
    public MyThread3(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        doSomething();
    }


    private void doSomething(){
        System.out.println("Sleeping...");
    }
}
