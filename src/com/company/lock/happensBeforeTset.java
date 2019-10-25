package com.company.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chengguanyi
 * @date 2019/10/22 14:30
 */
public class happensBeforeTset {

    private int a = 0;

    private AtomicInteger atomicInteger = new AtomicInteger(0);


    Thread thread1 = new Thread(() -> {

        for (; ; ) {
            try {
                TimeUnit.MILLISECONDS.sleep(3000);
                atomicInteger.getAndIncrement();
                //System.out.println(Thread.currentThread() + "---" + atomicInteger.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }, "thread1");


    Thread thread2 = new Thread(() -> {

        for (; ; ) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println(Thread.currentThread() + "---" + atomicInteger.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }, "thread2");

    public static void main(String[] args) {
        happensBeforeTset tset = new happensBeforeTset();
        tset.thread1.start();
        tset.thread2.start();
    }

}
