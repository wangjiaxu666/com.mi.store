package com.mi.store.entity;

import java.io.Serializable;

/**
 * http请求返回的最外成对象
 */
public class Result<T> implements Serializable {
    /**
     * 错误码
     */
    private String code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
