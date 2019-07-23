package com.company.Queue;

import java.util.concurrent.TimeUnit;

/**
 * @author chengguanyi
 * @date 2019/4/4 15:46
 */
public class EventClient {

    public static void main(String[] args) {
        final EventQueue eventQueue = new EventQueue();
        new Thread(() -> {
           for (;;){
               eventQueue.offer(new EventQueue.Event());
           }
        },"Product").start();


        new Thread(() -> {
            for (;;){
                eventQueue.take();
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer").start();

    }

}
