package com.demo.yunketang.util;

/**
 * Created by lianyuchen on 16/1/4.
 */

import com.demo.yunketang.MyApplication;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;
import org.json.JSONObject;

/**
 *
 * 这是用于网络请求的类
 */
public class NetRequestUtil {

    public static final String USER_LOGIN_URL = "";
    public static void requestUserLogin(RequestParams params, String url){

        MyApplication.getInstance().getClient().post(url, params, new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                //do something
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
            }
        });
    }
}
