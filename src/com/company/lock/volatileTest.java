package com.company.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chengguanyi
 * @date 2019/10/21 11:43
 */
public class volatileTest {

    synchronized


//    Thread thread2 = new Thread(() -> {
//        while (atomicInteger.get() <= 100) {
//            try {
//                TimeUnit.MILLISECONDS.sleep(100);
//                atomicInteger.getAndIncrement();
//                //System.out.println("thread2 ++ 变量增加" + atomicInteger.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }, "thread2");


    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 50; i++) {
                        try {
                            TimeUnit.MILLISECONDS.sleep(100);
                            atomicInteger.getAndIncrement();
                            //System.out.println("thread1 ++ 变量增加" + atomicInteger.get());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            ts.add(t);
        }

        for (Thread t : ts) {
            t.start();
        }
        try {
            for (Thread t : ts) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(atomicInteger.get());
    }

}
