package com.tanghuachun.demo.common.interceptor;
import com.tanghuachun.demo.common.response.Response;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author darren
 */
public class BossInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getParameter("token");
        System.out.println("Token为：" + token);
        Response.defaultHttpResponse(response, "1001", "token为空");
        return false;
    }
    /**
     * 在业务处理器处理请求执行完成后，
     * 生成视图之前执行。后处理（调用了Service并返回ModelAndView，但未进行页面渲染）
     * 有机会修改ModelAndView
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println(request.getContextPath() + "============postHandle==========");
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用，也就是说视图渲染已经完毕或者调用者已经拿到结果
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println(request.getContextPath() + "============afterCompletion==========");
    }

}
