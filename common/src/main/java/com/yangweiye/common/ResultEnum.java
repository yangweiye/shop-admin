package com.yangweiye.common;

public enum ResultEnum {
    CONTINUE(100, "继续"),
    OK(200, "成功"),
    CREATED(201, "成功创建"),
    ACCEPTED(202, "成功接收请求"),
    NO_CONTENT(204, "成功且无返回"),
    MOVED_PERMANENTLY(301, "永久重定向"),
    FOUND(302, "临时重定向"),
    NOT_MODIFIED(304, "未修改，可使用缓存"),
    BAD_REQUEST(400, "请求语法错误"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "明示拒绝"),
    NOT_FOUND(404, "找不到资源"),
    INTERNAL_SERVER_ERROR(500, "服务器出现错误"),
    SERVICE_UNAVAILABLE(503, "服务器超载或维护"),
    NOT_PARAM(10001, "请求参数错误"),
    NOT_EXIST_USER_OR_ERROR_PASSWORD(10002, "用户不存在或密码错误");

    private final Integer code;
    private final String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
