//package com.tanghuachun.demo.common.httpproxy;
//
//import com.tanghuachun.demo.common.response.Response;
//import com.tanghuachun.demo.common.response.ResponseCode;
//import org.mitre.dsmiley.httpproxy.ProxyServlet;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * 这是一个默认的Http代理类，自定义两个方法，
// * checkToken 用来校验token是否有效，这个方法是抽象方法，具体实现在子类中，
// * 如果不需要校验token，子类实现直接返回true
// * errorTokenResponse token校验不通过的时打包返回response,提供了默认实现，可以在继承类中重写该方法
// *
// * @author darren
// */
//public abstract class BaseHttpProxy extends ProxyServlet {
//    private final static Logger log = LoggerFactory.getLogger(BaseHttpProxy.class);
//    private boolean doCheckToken;
//
//    public BaseHttpProxy(boolean doCheckToken) {
//        this.doCheckToken = doCheckToken;
//    }
//
//    /**
//     * 检验Token是否有效
//     *
//     * @param servletRequest
//     * @return
//     */
//    protected abstract boolean checkToken(HttpServletRequest servletRequest);
//
//    /**
//     * token校验不通过的时打包返回response
//     *
//     * @param response
//     * @return
//     */
//    protected void errorTokenResponse(HttpServletResponse response) {
//        Response.defaultHttpResponse(response, ResponseCode.TOKEN_INVALID.getCode(), ResponseCode.TOKEN_INVALID.getDesc());
//    }
//
//    /**
//     * 重写service方法，在进行转发之前可以做一些token的拦截等操作
//     *
//     * @param servletRequest
//     * @param servletResponse
//     * @throws ServletException
//     * @throws IOException
//     */
//    @Override
//    protected void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
//        if (doCheckToken) {
//            if (!checkToken(servletRequest)) {
//                errorTokenResponse(servletResponse);
//                return;
//            }
//        }
//        super.service(servletRequest, servletResponse);
//    }
//}
