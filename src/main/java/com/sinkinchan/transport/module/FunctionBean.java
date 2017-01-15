package com.sinkinchan.transport.module;

/**
 * Created by apple on 2016/11/9.
 */
public class FunctionBean extends BaseTransportBean {
    private String id;
    private String functionName;

    public String getCacheKey() {
        return "Function_" + id;
    }

    public String getId() {
        return id;
    }

    public FunctionBean setId(String id) {
        this.id = id;
        return this;
    }

    public String getFunctionName() {
        return functionName;
    }

    public FunctionBean setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
}
