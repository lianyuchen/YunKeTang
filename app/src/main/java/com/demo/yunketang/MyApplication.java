package com.demo.yunketang;

import android.app.Application;

import com.loopj.android.http.AsyncHttpClient;

/**
 * Created by lianyuchen on 16/1/4.
 */
public class MyApplication extends Application {
    private static MyApplication app;
    private AsyncHttpClient client;
    public static MyApplication getInstance() {
        return app;
    }

    @Override
    public void onCreate() {
        app = this;
        super.onCreate();
    }

    public AsyncHttpClient getClient() {
        if (client == null) {
            client = new AsyncHttpClient();
        }
        return client;
    }
}
