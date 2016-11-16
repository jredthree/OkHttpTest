package com.jredthree.okhttptest.http;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * author: smart
 * time: 2016/11/15
 */

public class OkHttpManager {
    private static OkHttpManager mInstance;
    private OkHttpClient mOkHttpClient;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private OkHttpManager(){
        mOkHttpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()
                        .build();
                return chain.proceed(request);
            }
        }).build();
    }

    public static OkHttpManager getInstance() {
        if (mInstance == null) {
            synchronized (OkHttpManager.class) {
                if (mInstance == null) {
                    mInstance = new OkHttpManager();
                }
            }
        }
        return mInstance;
    }

    private Request _Request(String url){
        Request request = new Request.Builder()
                .url(url)
                .build();
        return request;
    }

    public  Request _postRequest(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
       return request;
    }

    public  Request _putRequest(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .build();
        return request;
    }

    private Response _getExecute(String url) throws IOException {
        Call call = mOkHttpClient.newCall(_Request(url));
        Response response = call.execute();
        return response;
    }

    private Response _postExecute(String url, String json)throws IOException {
        Call call = mOkHttpClient.newCall(_postRequest(url,json));
        Response response = call.execute();
        return response;
    }

    private Response _putExecute(String url, String json)throws IOException {
        Call call = mOkHttpClient.newCall(_putRequest(url,json));
        Response response = call.execute();
        return response;
    }

    public Response getAsyn(String url) throws IOException {
        Response response = _getExecute(url);
        return response;
    }

    public Response postAsyn(String url, String json) throws IOException {
        Response response = _postExecute(url,json);
        return response;
    }

    public Response putAsyn(String url, String json) throws IOException {
        Response response = _putExecute(url,json);
        return response;
    }
}
