package com.tanghuachun.demo.common.aop.pageHelper;



import java.lang.annotation.*;

/**
 * @author darren
 * @Date: 2018/11/13 19:55
 * @Description:
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyPageHelper {
}
