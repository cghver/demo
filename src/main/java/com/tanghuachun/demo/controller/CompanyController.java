package com.tanghuachun.demo.controller;

import com.tanghuachun.demo.common.aop.validate.MyValid;
import com.tanghuachun.demo.common.response.PageResponse;
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
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
    PageResponse findWithConditions(@RequestBody FindWithConditionsRequest request){
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
}
