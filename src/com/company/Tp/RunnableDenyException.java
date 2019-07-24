package com.company.Tp;

/**
 * @author chengguanyi
 * @date 2019/7/24 14:19
 */
public class RunnableDenyException extends RuntimeException{

    public RunnableDenyException(String message){
        super(message);
    }

}
