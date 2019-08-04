package com.interview;

import java.util.Stack;

/**
 * @ClassName IsValid
 * @Description 有效的括号
 * @Author cgy
 * @Date 2019-08-04 16:45
 * @Version 1.0
 */
public class IsValid {

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == '(' || '[' == c || '{' == c){
                stack.push(s.charAt(i));
            }
            if (c == ')'){
                if (stack.empty()){
                    return false;
                }
                if (stack.peek().charValue() != '('){
                    return false;
                }else {
                    stack.pop();
                }
            }
            if (c == ']'){
                if (stack.empty()){
                    return false;
                }
                if (stack.peek().charValue() != '['){
                    return false;
                }else {
                    stack.pop();
                }
            }
            if (c == '}'){
                if (stack.empty()){
                    return false;
                }
                if (stack.peek().charValue() != '{'){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }

}
