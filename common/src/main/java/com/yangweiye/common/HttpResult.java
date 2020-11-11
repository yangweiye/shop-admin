package com.yangweiye.common;


import com.yangweiye.exception.DefinitionException;

public class HttpResult<T> {
    private Integer code;
    private String message;
    private T data;

    public HttpResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public HttpResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public HttpResult(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    public HttpResult(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static HttpResult<Object> defineError(DefinitionException definitionException) {
        return new HttpResult<Object>(definitionException.getErrorCode(), definitionException.getErrorMessage());
    }

    public static HttpResult<Object> otherError(ResultEnum resultEnum) {
        return new HttpResult<Object>(resultEnum);
    }

    public static <G> HttpResult<G> success(G data) {
        System.out.println(data.getClass());
        return new HttpResult<G>(ResultEnum.OK, data);
    }
}
