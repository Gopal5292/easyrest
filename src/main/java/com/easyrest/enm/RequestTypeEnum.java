package com.easyrest.enm;

import lombok.Data;

/**
 * Created by thomas31 on 7/31/2018.
 */
public enum RequestTypeEnum {

    STRING("String"),
    INTEGER("Integer"),
    LONG("Long"),
    OBJECT("Object");

    private String requestType;

    RequestTypeEnum(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
}
