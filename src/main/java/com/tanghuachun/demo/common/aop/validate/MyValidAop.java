package com.tanghuachun.demo.common.aop.validate;

import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.common.response.Response;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Auther: Tang XiaoBai
 * @Date: 2018/11/13 17:09
 * @Description:
 */
@Aspect
@Component
public class MyValidAop {
    @Around(value = "@annotation(MyValid)&&@annotation(myValid)", argNames = "joinPoint,myValid")
    @Order(5)
    public Object around(ProceedingJoinPoint joinPoint, MyValid myValid) throws Throwable {
        Object[] objects = joinPoint.getArgs();
        for (Object o : objects) {
            try {
                ValidateHelper.validate(o);
            } catch (ValidateException e) {
                if (myValid.returnPageResponseType()){
                    return PageResponse.failed(myValid.errCode().getCode(), e.getMessage());
                }
                return Response.failed(myValid.errCode(), e.getMessage());
            }
        }
        return joinPoint.proceed();
    }
}
