package com.company.proxy;

/**
 * @ClassName JavaCoder
 * @Description
 * @Author cgy
 * @Date 2019-08-11 23:54
 * @Version 1.0
 */
public class JavaCoder implements ICoder {

    private String name;

    public JavaCoder(String name){
        this.name = name;
    }

    @Override
    public void impldemand(String functionname) {
        System.out.println(name + "implemented demand:" + functionname + "in java");
    }

}
