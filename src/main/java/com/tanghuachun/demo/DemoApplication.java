package com.tanghuachun.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@PropertySource(value = "file:${config.path}/application.properties")
@SpringBootApplication
@MapperScan("com.tanghuachun.demo.dao")
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableConfigurationProperties
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
