package com.company.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName CoderDynamicProxy
 * @Description 动态代理类
 * @Author cgy
 * @Date 2019-08-12 00:12
 * @Version 1.0
 */
public class CoderDynamicProxy implements InvocationHandler {

    private ICoder coder;

    public CoderDynamicProxy(ICoder iCoder){
        this.coder = iCoder;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("动态：");
        Object result = method.invoke(coder,args);
        return result;

    }
}
