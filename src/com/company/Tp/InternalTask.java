package com.company.Tp;

/**
 * @author chengguanyi
 * @date 2019/7/24 14:30
 */
public class InternalTask implements Runnable {

    private final RunnableQueue runnableQueue;

    private volatile boolean running = true;

    public InternalTask(RunnableQueue runnableQueue){
        this.runnableQueue = runnableQueue;
    }

    @Override
    public void run() {
        //如果当前任务为running并且没有被中断，则将其不断地从queue中获取runnable
        while (running && !Thread.currentThread().isInterrupted()){
            Runnable task = runnableQueue.take();
            task.run();
        }
    }

    public void stop(){
        this.running = false;
    }
}
