package com.tanghuachun.demo.controller;

import com.tanghuachun.demo.common.aop.validate.MyValid;
import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.request.FindWithConditionsRequest;
import com.tanghuachun.demo.service.CompanyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @PostMapping("/findWithConditions")
    @MyValid(returnPageResponseType = true)
    PageResponse findWithConditions(@RequestBody FindWithConditionsRequest request){
        return companyService.findWithConditions(request);
    }
}
