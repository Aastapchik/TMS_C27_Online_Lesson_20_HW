package com.teachmeskills.lesson20.task2.thread;

/**
 * Action Simulation Class
 */
public class MyThread2 implements Runnable{
    private String name;
    public MyThread2(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        doSomething();
    }

    private void doSomething(){
        System.out.println("Eating...");
    }
}
