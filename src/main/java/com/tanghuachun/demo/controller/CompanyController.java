package com.tanghuachun.demo.controller;

import com.tanghuachun.demo.common.aop.validate.MyValid;
import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.request.FindWithConditionsRequest;
import com.tanghuachun.demo.service.CompanyService;
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
public class CompanyController {

    @Resource
    private CompanyService companyService;
    @Autowired
    private RedissonClient redissonClient;

    @PostMapping("/findWithConditions")
    @MyValid(returnPageResponseType = true)
    PageResponse findWithConditions(@RequestBody FindWithConditionsRequest request){

        RQueue<String> queue = redissonClient.getQueue("queue1");
        queue.add("tanghuachun");
        queue.add("darren");
        queue.add("thc");
        System.out.println(queue.readAll());
        System.out.println(queue.poll());
        System.out.println(queue.readAll());


        return companyService.findWithConditions(request);
    }
}
