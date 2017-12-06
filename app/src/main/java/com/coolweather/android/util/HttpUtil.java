package com.coolweather.android.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by cszxw on 2017/12/3.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        Log.d("HttpUtil", "sendOkHttpRequest: address:"+address);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
