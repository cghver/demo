package com.tanghuachun.demo.common.httpproxy;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BossHttpProxy extends BaseHttpProxy {
    public BossHttpProxy(boolean doCheckToken) {
        super(doCheckToken);
    }

    @Override
    protected boolean checkToken(HttpServletRequest servletRequest) {
        String token = servletRequest.getHeader("token");
        if (token == null){
            return false;
        }
        return true;
    }

    @Override
    protected void errorTokenResponse(HttpServletResponse response) {
        super.errorTokenResponse(response);
    }
}
