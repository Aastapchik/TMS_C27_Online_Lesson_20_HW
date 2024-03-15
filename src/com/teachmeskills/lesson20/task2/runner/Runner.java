package com.teachmeskills.lesson20.task2.runner;

import com.teachmeskills.lesson20.task2.thread.MyThread;
import com.teachmeskills.lesson20.task2.thread.MyThread2;
import com.teachmeskills.lesson20.task2.thread.MyThread3;

/**
 * Program imitation class
 */
public class Runner {

    public static void main(String[] args) {

        Thread myThread1 = new Thread(new MyThread("Coffee"));
        Thread myThread2 = new Thread(new MyThread2("Eat"));
        Thread myThread3 = new Thread(new MyThread3("Sleep"));
        myThread1.setPriority(2);
        myThread2.setPriority(7);
        myThread3.setPriority(1);
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
