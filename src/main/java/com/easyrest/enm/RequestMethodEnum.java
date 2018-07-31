package com.easyrest.enm;

/**
 * Created by thomas31 on 7/31/2018.
 */
public enum  RequestMethodEnum {

    GET("GET"),
    POST("POST"),
    DELETE("PUT"),
    PUT("PUT");

    private String requestMethod;

    RequestMethodEnum(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }
}
