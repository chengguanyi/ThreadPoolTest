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

}
