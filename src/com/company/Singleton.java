package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengguanyi
 * @date 2019/4/22 19:43
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private static int x = 0;

    private static int y;



    private Singleton(){
        x++;
        y++;
    }

    private static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.x);
        System.out.println(singleton.y);

    }


}
