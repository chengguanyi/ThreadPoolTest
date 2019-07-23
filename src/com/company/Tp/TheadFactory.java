package com.company.Tp;

/**
 * @ClassName TheadFactory
 * @Description
 * @Author cgy
 * @Date 2019-07-22 23:32
 * @Version 1.0
 */
@FunctionalInterface
public interface TheadFactory {

    Thread createThread(Runnable runnable);
}
