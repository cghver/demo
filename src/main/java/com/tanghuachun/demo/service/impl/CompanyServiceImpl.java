package com.tanghuachun.demo.service.impl;
import com.tanghuachun.demo.common.aop.log.MyLog;
import com.tanghuachun.demo.common.aop.pageHelper.MyPageHelper;
import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.dao.CompanyDao;
import com.tanghuachun.demo.entity.Company;
import com.tanghuachun.demo.entity.CompanyExample;
import com.tanghuachun.demo.request.FindWithConditionsRequest;
import com.tanghuachun.demo.service.CompanyService;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    private CompanyDao companyDao;

    @Override
    @MyLog
    public PageResponse findWithConditions(FindWithConditionsRequest request) {
        //springboot2.0默认使用cglib动态代理，但假如实现了某个接口就会使用jdk动态代理
        //因而需要如下调用方式
        return ((CompanyServiceImpl)AopContext.currentProxy()).find(request);
    }

    @MyPageHelper
    public PageResponse find(FindWithConditionsRequest request){
        CompanyExample example = new CompanyExample();
        CompanyExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike(request.getStartWith()+"%");
        companyDao.selectByExample(example);
        return PageResponse.success();
    }
}
