package com.company.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chengguanyi
 * @date 2019/10/25 9:36
 */
public class WaitAndNotifyTest {


    private AtomicInteger hamburger = new AtomicInteger(10);

    private int max = 20;


    Thread thread1 = new Thread(() -> {
        while (true) {
            synchronized (hamburger) {
                while (hamburger.get() >= max) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "存量已满，等待销售");
                        TimeUnit.MILLISECONDS.sleep(100);
                        hamburger.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                hamburger.getAndIncrement();
                System.out.println(Thread.currentThread().getName() + "正在生产" + "已生产" + hamburger.get() + "个");
                hamburger.notifyAll();

                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }, "producter");


    Thread thread2 = new Thread(() -> {
        while (true) {
            synchronized (hamburger) {
                while (hamburger.get() <= 0) {
                    try {
                        hamburger.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                hamburger.getAndDecrement();
                System.out.println(Thread.currentThread().getName() + "汉堡卖出" + 1 + "个");
                hamburger.notifyAll();

                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }, "consumer");


    public static void main(String[] args) {
        WaitAndNotifyTest test = new WaitAndNotifyTest();
        test.thread1.start();
        test.thread2.start();
    }


}
