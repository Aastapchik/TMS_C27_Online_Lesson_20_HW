package com.teachmeskills.lesson20.task1.runner;

import com.teachmeskills.lesson20.task1.thread.MyThread;
import com.teachmeskills.lesson20.task1.thread.MyThread2;
import com.teachmeskills.lesson20.task1.thread.MyThread3;

/**
 * Program imitation class
 */
public class Runner {

    public static void main(String[] args) {

        Thread myThread1 = new MyThread("Coffee");
        myThread1.setPriority(1);
        myThread1.start();


        Thread myThread2 = new MyThread2("Eat");
        myThread2.setPriority(10);
        myThread2.start();

        Thread myThread3 = new MyThread3("Sleep");
        myThread2.setPriority(4);
        myThread3.start();

    }
}
