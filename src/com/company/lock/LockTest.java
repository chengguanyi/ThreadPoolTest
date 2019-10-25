package com.company.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chengguanyi
 * @date 2019/8/27 10:45
 */
public class LockTest {

    public static void main(String[] args) {
        String ss = "image/png";
        String[] arr = ss.split("/");
        System.out.println(arr[0]);
    }
    

}
