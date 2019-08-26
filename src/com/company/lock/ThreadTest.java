package com.company.lock;


import java.util.concurrent.TimeUnit;

/**
 * @author chengguanyi
 * @date 2019/8/26 14:21
 */
public class ThreadTest implements Runnable {

    private static int count = 1000;

    @Override
    public void run() {
        while (count != 0) {
            synchronized (this) {
                try {
                    System.out.println(Thread.currentThread().getName() + "消费掉一个单位：" + count);
                    count--;
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        new Thread(threadTest, "thread1").start();
        new Thread(threadTest, "thread2").start();
    }
}
