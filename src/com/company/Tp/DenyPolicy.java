package com.company.Tp;

/**
 * @ClassName DenyPolicy
 * @Description 拒绝策略
 * @Author cgy
 * @Date 2019-07-23 01:16
 * @Version 1.0
 */
@FunctionalInterface
public interface DenyPolicy {

    void reject(Runnable runnable,ThreadPool threadPool);

    //该拒绝策略会直接将任务丢弃
    class DiscardDenyPolicy implements DenyPolicy{
        @Override
        public void reject(Runnable runnable, ThreadPool threadPool) {
            //do nothing
        }
    }

    //该拒绝策略会向任务提交者抛出异常
    class AbsortDenyPoilcy implements DenyPolicy{
        @Override
        public void reject(Runnable runnable, ThreadPool threadPool) {
            throw new RunnableDenyException("the runnable" + runnable + "with" + threadPool);
        }
    }


    //该拒绝策略会使任务在提交者所在的线程中执行任务
    class RunnerDenyPolicy implements DenyPolicy{
        @Override
        public void reject(Runnable runnable, ThreadPool threadPool) {
            if (!threadPool.isShutdown()){
                runnable.run();
            }
        }
    }


}
