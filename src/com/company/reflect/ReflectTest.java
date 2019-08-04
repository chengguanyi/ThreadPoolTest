package com.company.reflect;

import java.lang.reflect.Field;

/**
 * @ClassName ReflectTest
 * @Description 测试类
 * @Author cgy
 * @Date 2019-07-30 23:19
 * @Version 1.0
 */
public class ReflectTest {




    public static void main(String[] args) {

        //获取类对象
        Class clazz;

        {
            try {
                clazz = Class.forName("com.company.reflect.ReflectModel");

                //获取class的所有属性
                Field[] allField = clazz.getDeclaredFields();
                try {
                    Field age = clazz.getDeclaredField("age");
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }

                for (int i = 0;i<allField.length;i++)
                    System.out.println(allField[i]);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

}
