package com.example.demo.netty_http.params;

import lombok.Data;

import java.io.Serializable;
@Data
public class Response implements Serializable {
    private static final long serialVersionUID=42L;

    private String requestId;
    private String errorMsg;
    private Object result;

    @Override
    public String toString() {
        return "Request{" +
                "requestId='" + requestId + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                ", result=" + result +
                '}';
    }
}
