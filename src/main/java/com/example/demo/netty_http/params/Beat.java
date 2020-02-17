package com.example.demo.netty_http.params;

public final class Beat {
    public static final int BEAT_INTERVAL=30;
    public static final String BEAT_ID="BEAT_PING_PONG";

    public static Request BEAT_PING;
    static{
        BEAT_PING=new Request();
        BEAT_PING.setRequestId(BEAT_ID);
    }
}
