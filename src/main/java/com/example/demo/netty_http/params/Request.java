package com.example.demo.netty_http.params;

import java.io.Serializable;

public class Request implements Serializable {
    private static final long serialVersionUID=42L;

    private String requestId;
    private long createMillisTime;

}
