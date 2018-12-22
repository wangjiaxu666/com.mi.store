package com.mi.store.utils;

import com.mi.store.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 捕获异常
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger= LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof MyException){
            MyException myException=(MyException) e;
            return ResultUtil.error(myException.getCode(),myException.getMessage());

        }else{
            logger.error("【系统异常】{}",e);
            return ResultUtil.error("-1",e.toString());
        }
    }
}
