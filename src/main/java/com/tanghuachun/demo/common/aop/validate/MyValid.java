package com.tanghuachun.demo.common.aop.validate;
import com.tanghuachun.demo.common.response.ResponseCode;

import java.lang.annotation.*;

/**
 * @author darren
 * @Date: 2018/11/13 17:05
 * @Description: 该注解是对hibernate validate的框架封装，用来校验参数，只要在方法上
 * 添加该注解，注意方法的返回类型是ReturnMessage类型
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyValid {

    ResponseCode errCode() default ResponseCode.PARAM_ERROR;

    /**
     * 默认的返回格式是Response，如果设置值为true，则返回PageResponse格式的数据
     * @return true or false
     */
    boolean returnPageResponseType() default false;
}
