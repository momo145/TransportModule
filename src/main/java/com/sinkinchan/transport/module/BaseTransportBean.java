package com.sinkinchan.transport.module;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by apple on 16/10/7.
 */
public abstract class BaseTransportBean implements Serializable {


    protected TransportType type;


    public TransportType getType() {
        return type;
    }

    public BaseTransportBean setType(TransportType type) {
        this.type = type;
        return this;
    }

    public abstract String getCacheKey();
}
