package com.mi.store.utils;


import com.mi.store.entity.Result;

public class ResultUtil {

    public static Result success(){
        return success(null);
    }

    public static Result success(Object object){
        Result result=new Result();
        result.setCode("1");
        result.setMsg("success");
        result.setData(object);
        return result;
    }
    public static Result success(String msg,Object object){
        Result result=new Result();
        result.setCode("1");
        result.setMsg(msg);
        result.setData(object);
        return result;
    }



    public static Result error(String code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
