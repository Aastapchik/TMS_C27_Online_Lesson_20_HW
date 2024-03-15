package com.teachmeskills.lesson20.task1.thread;

/**
 * Action Simulation Class
 */
public class MyThread extends Thread{


    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        doSomething();
    }

    private void doSomething(){
        System.out.println("Drinking coffee");
    }
    
}


