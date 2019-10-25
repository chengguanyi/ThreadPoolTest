package com.company.lock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chengguanyi
 * @date 2019/8/26 14:21
 */
public class ThreadTest implements Runnable {

    Lock lock = new ReentrantLock();
    private static int count = 100;
    private volatile int index = 0;

    @Override
    public void run() {
        while (index < count) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+"得到了锁，正在读取文件……");
                System.out.println(Thread.currentThread().getName() + "第：" + index+"个");
                index++;
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println(Thread.currentThread().getName()+"释放了锁！");
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        new Thread(threadTest, "thread1").start();
        new Thread(threadTest, "thread2").start();
        new Thread(threadTest, "thread3").start();
        new Thread(threadTest, "thread4").start();
    }
}
