package com.example.demo.netty_http.params;

import lombok.Data;

import java.io.Serializable;
@Data
public class Request implements Serializable {
    private static final long serialVersionUID=42L;

    private String requestId;
    private long createMillisTime;

    @Override
    public String toString() {
        return "Request{" +
                "requestId='" + requestId + '\'' +
                ", createMillisTime=" + createMillisTime +
                '}';
    }
}
