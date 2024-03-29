package com.tanghuachun.demo.common.aop.pageHelper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tanghuachun.demo.common.request.BasePageRequest;
import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.common.response.ResponseCode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Auther: Tang XiaoBai
 * @Date: 2018/11/13 19:57
 * @Description:
 */
@Aspect
@Component
public class MyPageHelperAop {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @SuppressWarnings("unchecked")
    @Around(value = "@annotation(MyPageHelper)")
    @Order(15)
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] objects = joinPoint.getArgs();
        for (Object o : objects) {
            if (o instanceof BasePageRequest) {
                Page<Object> page = PageHelper.startPage(((BasePageRequest) o).getPageNo(), ((BasePageRequest) o).getPageSize());
                Object ret = joinPoint.proceed();
                if (ret instanceof PageResponse) {
                    ((PageResponse) ret).setMsg(ResponseCode.SUCCESS.getDesc());
                    ((PageResponse) ret).setCode(ResponseCode.SUCCESS.getCode());
                    ((PageResponse) ret).setTotal((int) page.getTotal());
                    ((PageResponse) ret).setData(page.getResult());
                    ((PageResponse) ret).setTotalPages(page.getPages());
                    ((PageResponse) ret).setPageNo(((BasePageRequest) o).getPageNo());
                    ((PageResponse) ret).setPageSize(((BasePageRequest) o).getPageSize());
                    return ret;
                }
            }
        }
        return null;
    }
}
