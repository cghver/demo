package com.tanghuachun.demo.common.config;
import com.tanghuachun.demo.common.response.Response;
import com.tanghuachun.demo.common.response.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * 遇到不可预知的异常时，程序会捕获，将异常返回
 */
@ControllerAdvice
public class DefaultExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response errorResponse(Exception exception) {
        /**
        　　* @description: 不可预知的异常处理，返回友好格式
        　　* @param [exception]
        　　* @return com.cl.albatross.common.response.Response
        　　* @author fhm
        　　* @date 2019-12-05 0005 19:21:18
        　　*/
        logger.info("异常:{}", exception);
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        exception.fillInStackTrace().printStackTrace(printWriter);
        return Response.failed(ResponseCode.UNKNOW_ERROR.getCode(), result.toString());
    }
}
