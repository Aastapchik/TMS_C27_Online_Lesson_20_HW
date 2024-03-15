package com.teachmeskills.lesson20.task1.thread;

/**
 * Action Simulation Class
 */
public class MyThread2 extends Thread{
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        doSomething();
    }

    public void doSomething(){
        System.out.println("Eating...");
    }
}
