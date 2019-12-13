package com.tanghuachun.demo.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.tanghuachun.demo.common.aop.validate.MyValid;
import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.request.FindWithConditionsRequest;
import com.tanghuachun.demo.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/company")
@Slf4j
public class CompanyController {

    @Resource
    private CompanyService companyService;
    @Autowired
    private RedissonClient redissonClient;

    @PostMapping("/findWithConditions")
    @MyValid(returnPageResponseType = true)
    PageResponse findWithConditions(@RequestBody FindWithConditionsRequest request) {
        return companyService.findWithConditions(request);
    }

    public static void main(String[] args) {
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        //ServletUtil.write();
        System.out.println(IdUtil.objectId());
    }
}
