package com.company.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName Test
 * @Description
 * @Author cgy
 * @Date 2019-08-12 00:03
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ICoder coder = new JavaCoder("xx码农 ");
        //ICoder porxy = new CoderPorxy(coder);
        //porxy.impldemand("add function1");

        //创建中介类实例
        InvocationHandler handler = new CoderDynamicProxy(coder);
        //获取类加载器
        ClassLoader cl = coder.getClass().getClassLoader();
        //动态生成一个代理类
        ICoder proxy = (ICoder) Proxy.newProxyInstance(cl,coder.getClass().getInterfaces(),handler);
        proxy.impldemand("add function2 ");
    }

}
