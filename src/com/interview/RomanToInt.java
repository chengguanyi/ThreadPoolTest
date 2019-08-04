package com.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName RomanToInt
 * @Description 罗马数字转整数
 * @Author cgy
 * @Date 2019-08-01 22:51
 * @Version 1.0
 */
public class RomanToInt {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));

    }



    public static int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CD",400);
        map.put("CM",900);

        int num = 0;

        for (int i = 0; i< s.length();){
            if (i+1 < s.length() && map.containsKey(s.substring(i,i+2))){
                num += map.get(s.substring(i,i+2));
                i+=2;
            }else {
                num += map.get(s.substring(i,i+1));
                i++;
            }
        }

        return num;
    }

}
