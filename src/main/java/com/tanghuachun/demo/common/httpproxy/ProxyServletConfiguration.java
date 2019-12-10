package com.tanghuachun.demo.common.httpproxy;
import org.mitre.dsmiley.httpproxy.ProxyServlet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ProxyServletConfiguration {
    @Value("#{'${http.proxy.boss.auth.src}'.split(',')}")
    private String[] bossAuthSrc;
    @Value("${http.proxy.boss.auth.target}")
    private String bossAuthTarget;

    @Value("#{'${http.proxy.boss.open.src}'.split(',')}")
    private String[] bossOpenSrc;
    @Value("${http.proxy.boss.open.target}")
    private String bossOpenTarget;

    @Bean
    public ServletRegistrationBean bossAuth() {
        return initBean(new BossHttpProxy(true), bossAuthSrc, bossAuthTarget, true);
    }

    @Bean
    public ServletRegistrationBean bossOpen() {
        return initBean(new BossHttpProxy(false), bossOpenSrc, bossOpenTarget, true);
    }

    /**
     * 注册代理Bean
     * @param t 代理实现类
     * @param src 原地址
     * @param target 目的地址
     * @param enabledLog 是否开启转发日志
     * @return
     */
    private <T extends BaseHttpProxy> ServletRegistrationBean initBean(T t, String[] src, String target, boolean enabledLog){
        ServletRegistrationBean<BaseHttpProxy> servletRegistrationBean =
                new ServletRegistrationBean<>(t, src);
        //这个setName必须要设置，并且多个的时候，名字需要不一样
        servletRegistrationBean.setName(src[0] + target);
        //转发的目标地址
        servletRegistrationBean.addInitParameter("targetUri", target);
        //是否开启转发日志
        if (enabledLog){
            servletRegistrationBean.addInitParameter(ProxyServlet.P_LOG, "true");
        }
        return servletRegistrationBean;
    }

}