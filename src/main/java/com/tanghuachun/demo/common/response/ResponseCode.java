package com.tanghuachun.demo.common.response;
public enum ResponseCode {
    /**
     * 成功
     */
    SUCCESS("0000", "成功"),
    /**
     * 失败
     */
    FAILED("1001", "失败"),

    /**
     * 参数错误
     */
    PARAM_ERROR("1002", "参数错误"),

    /**
     * 连接超时
     */
    CONNECT_TIMEOUT("1003", "连接超时"),

    /**
     * 读取数据超时
     */
    READ_TIMEOUT("1004", "读取数据超时"),

    /**
     * 数据不存在
     */
    DATA_NOT_EXISTS("1005", "数据不存在"),

    /**
     * 数据已存在
     */
    DATA_EXISTS("1006", "数据已存在"),

    /**
     * 数据库操作异常
     */
    DB_ERROR("1007", "数据库操作异常"),

    /**
     * token无效
     */
    TOKEN_INVALID("1008", "token无效"),

    /**
     * 未知异常
     */
    UNKNOW_ERROR("9999", "未知异常");

    private String code;
    private String desc;

    public String getCode() {
        return code;
    }


    public String getDesc() {
        return desc;
    }

    ResponseCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public boolean isSuccess() {
        return this.equals(SUCCESS);
    }
}
