package com.tanghuachun.demo.controller;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.cache.GuavaCache;
import com.google.common.cache.CacheBuilder;
import com.tanghuachun.demo.common.aop.validate.MyValid;
import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.common.time.TimeHelper;
import com.tanghuachun.demo.entity.Company;
import com.tanghuachun.demo.request.FindWithConditionsRequest;
import com.tanghuachun.demo.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RQueue;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
    PageResponse findWithConditions(@RequestBody FindWithConditionsRequest request){ ;
//        Company company = new Company();
//        company.setAddress("上海");
//        Company company1 = new Company();
//        company1.setAddress("北京");
//        RQueue<Company> queue = redissonClient.getQueue("queue1");
//        queue.add(company);
//        queue.add(company1);
//
//        RQueue<String>  stringRQueue = redissonClient.getQueue("queue");
//        stringRQueue.add("tang");
//        stringRQueue.add("hua");
//        stringRQueue.add("chun");
//        log.info("{}", stringRQueue.poll());
//        log.info("地址是：{}", queue.poll().getAddress());
        return companyService.findWithConditions(request);
    }

    public static void main(String[] args) {
        System.out.println(DateUtil.format(new Date(), "yyMMdd"));
    }
}
