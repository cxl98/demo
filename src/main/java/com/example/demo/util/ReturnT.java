package com.example.demo.util;

import java.io.Serializable;

public class ReturnT<T> implements Serializable {
    public static final long serialVersionUID=208L;
    public static final int SUCCESS_CODE=200;
    public static final int FAIL_CODE=500;


    public static final ReturnT<String> SUCCESS = new ReturnT<String>(null);
    public static final ReturnT<String> FAIL = new ReturnT<String>(FAIL_CODE, null);

    private int code;
    private String msg;
    private T data;
    public ReturnT(){}
    public ReturnT(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ReturnT(T data) {
        this.code = SUCCESS_CODE;
        this.data = data;
    }
    @Override
    public String toString() {
        return "ReturnT[" +
                "code=" + code +
                ", msg='" + msg +
                ", data=" + data +
                ']';
    }
}
