package com.mi.store.utils;

public class MyException extends RuntimeException {

    private String code;


    public MyException(String code,String msg){
        super(msg);
        this.code=code;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
