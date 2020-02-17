package com.example.demo.utils;

import java.util.concurrent.*;

public class ThreadPool {
    public static ThreadPoolExecutor makeServerThreadPool(final String serverType) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(60, 300, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, serverType + "-serverHandlerPool-" + r.hashCode());
            }
        }
        );
        return pool;
    }
}
