package com.tanghuachun.demo.service;

import com.tanghuachun.demo.common.response.PageResponse;
import com.tanghuachun.demo.request.FindWithConditionsRequest;

public interface CompanyService {
    PageResponse findWithConditions(FindWithConditionsRequest request);
}
