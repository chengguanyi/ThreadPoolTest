package com.interview;

/**
 * @ClassName LongestCommonPrefix
 * @Description 最长公共前缀
 * @Author cgy
 * @Date 2019-08-02 03:11
 * @Version 1.0
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","floew","flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {


        if (strs.length == 0) {
            return "";
        }

        String a = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(a) != 0){
                a = a.substring(0,a.length() - 1);
                if (a.isEmpty()){
                    return "";
                }
            }
        }

        return a;
    }
}
