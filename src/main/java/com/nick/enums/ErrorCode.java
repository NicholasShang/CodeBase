package com.nick.enums;

/**
 * Created by Nick on 2018/5/31.
 */
public enum ErrorCode {

    SYSTEM_ERROR("SYSTEM","0001","系统错误"),

    USER_ERROR("USER","0001","用户未认证"),
    ;

    private String type;//根据不同的级别进行相应处理
    private String code;//错误码编号
    private String message;//错误信息

    ErrorCode(String type, String code, String message) {
        this.type = type;
        this.code = code;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"type\":\"")
                .append(type).append('\"');
        sb.append(",\"code\":\"")
                .append(code).append('\"');
        sb.append(",\"message\":\"")
                .append(message).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
