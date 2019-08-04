package com.interview;

/**
 * @ClassName Palindrome
 * @Description 回文数
 * @Author cgy
 * @Date 2019-08-01 13:01
 * @Version 1.0
 */
public class Palindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int temp = x;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x/=10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7))
                return false;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8))
                return false;
            rev = rev * 10 + pop;
        }
        System.out.println(rev);
        if (temp == rev){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

}
