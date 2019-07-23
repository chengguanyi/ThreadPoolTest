package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengguanyi
 * @date 2019/4/22 19:43
 */
public class Test {

    public static void main(String[] args) {
            List<String> list1 = new ArrayList<>();
            list1.add("1");
            list1.add("2");
            System.out.println(list1);
            List<String> list2 = new ArrayList<>();
            list2.add("4");
            list2.add("3");
            list1.retainAll(list2);
        System.out.println(list1.retainAll(list2));
            System.out.println(list1);
    }


}
