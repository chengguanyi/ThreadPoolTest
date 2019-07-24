package com.company.Tp;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;

/**
 * @author chengguanyi
 * @date 2019/7/24 16:52
 */
public class BasicThreadPool extends Thread implements ThreadPool {

    //初始化线程数量
    private final int initSize;

    //线程池最大线程数量
    private final int maxSize;

    //线程池核心线程数量
    private final int coreSize;

    //当前活跃的线程数量
    private int activeCount;

    //创建线程所需的工厂
    private final ThreadFactory threadFactory;

    //任务队列
    private final RunnableQueue runnableQueue;

    //线程池是否已经被shutdown
    private volatile boolean isShutdown = false;

    //工作线程队列
    private final Queue<Thread> threadQueue = new ArrayDeque<>();



}
