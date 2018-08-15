package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wanghan on 2018/8/15.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
