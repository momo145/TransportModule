package com.sinkinchan.transport.module;

/**
 * Created by apple on 2016/10/23.
 * 回复给客户端的某个Action的回应
 */
public class ActionResponse extends BaseTransportBean {
    private ResponseType responseType;
    private String desc;
    private String name;
    private String functionName;

    public enum ResponseType {
        Success, Failed, Error, Refused, Ask, Yes, No
    }

    @Override
    public String getCacheKey() {
        return null;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public ActionResponse setResponseType(ResponseType responseType) {
        this.responseType = responseType;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public ActionResponse setName(String name) {
        this.name = name;
        return this;
    }

    public ActionResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getFunctionName() {
        return functionName;
    }

    public ActionResponse setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
}
