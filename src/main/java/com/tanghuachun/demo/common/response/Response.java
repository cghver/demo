package com.tanghuachun.demo.common.response;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.log4j.Log4j2;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.List;
@Log4j2
public final class Response<T> implements Serializable {
    private String code;
    private String msg;
    private T data;

    public Response() {
    }

    public Response(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }


    public static <V> Response<V> success() {
        return new Response<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc(), null);
    }

    public static Response success(String msg) {
        return new Response<>(ResponseCode.SUCCESS.getCode(), msg, null);
    }

    public static <V> Response<V> success(V data) {
        return new Response<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc(), data);
    }

    public static <V> Response<V> success(String msg, V data) {
        return new Response<>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <V> Response<V> failed() {
        return new Response<>(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getDesc(), null);
    }

    public static Response failed(String msg) {
        return new Response<>(ResponseCode.FAILED.getCode(), msg, null);
    }

    public static <V> Response<V> failed(V data) {
        return new Response<>(ResponseCode.FAILED.getCode(), ResponseCode.FAILED.getDesc(), data);
    }

    public static <V> Response<V> failed(String msg, V data) {
        return new Response<>(ResponseCode.FAILED.getCode(), msg, data);
    }


    public static <V> Response<V> failed(ResponseCode responseCode) {
        return new Response<>(responseCode.getCode(), responseCode.getDesc(), null);
    }

    public static <V> Response<V> failed(ResponseCode responseCode, V data) {
        return new Response<>(responseCode.getCode(), responseCode.getDesc(), data);
    }

    public static <V> Response<V> failed(String code, String msg, V data) {
        return new Response<>(code, msg, data);
    }

    public static <V> Response<V> failed(String code, String msg) {
        return new Response<>(code, msg, null);
    }

    /**
     * 将Response的json字符串转化为response，data为Object,如果转失败，返回null
     *
     * @param json
     * @param bean
     * @return
     */
    public static <T> Response<T> jsonToResponse(String json, Class<T> bean) {
        String code = JSONUtil.parseObj(json).getStr("code");
        String msg = JSONUtil.parseObj(json).getStr("msg");
        String dataString = JSONUtil.parseObj(json).getStr("data");

        if (code == null || msg == null) {
            return null;
        }
        if (bean == null || dataString == null) {
            return new Response<>(code, msg, null);
        }
        T data = JSONUtil.toBean(dataString, bean);
        return new Response<>(code, msg, data);
    }

    /**
     * 将Response的json字符串转化为response，data为list,如果转失败，返回null
     *
     * @param json
     * @param bean
     * @return
     */
    public static <T> Response<List<T>> jsonToListResponse(String json, Class<T> bean) {
        String code = JSONUtil.parseObj(json).getStr("code");
        String msg = JSONUtil.parseObj(json).getStr("msg");
        String data = JSONUtil.parseObj(json).getStr("data");
        if (code == null || msg == null) {
            return null;
        }
        if (StrUtil.isBlank(data)) {
            return new Response<>(code, msg, null);
        }
        List<T> list = JSONUtil.toList(JSONUtil.parseArray(data), bean);
        return new Response<>(code, msg, list);
    }

    /**
     * 默认返回的HttpResponse，用在比如拦截器
     * @param response
     */
    public static void defaultHttpResponse(HttpServletResponse response, String code, String msg) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        try {
            writer = response.getWriter();
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", code);
            jsonObject.put("msg", msg);
            jsonObject.put("data", null);
            writer.print(jsonObject);
        } catch (IOException e) {
            log.error("拦截器输出流异常: {}", e);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
