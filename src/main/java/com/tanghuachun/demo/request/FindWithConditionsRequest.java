package com.tanghuachun.demo.request;

import com.tanghuachun.demo.common.request.BasePageRequest;

import javax.validation.constraints.NotBlank;

public class FindWithConditionsRequest extends BasePageRequest {
    @NotBlank(message = "搜索条件不能为空")
    private String startWith;

    public String getStartWith() {
        return startWith;
    }

    public void setStartWith(String startWith) {
        this.startWith = startWith;
    }

    @Override
    public String toString() {
        return "FindWithConditionsRequest{" +
                "startWith='" + startWith + '\'' +
                '}';
    }
}
