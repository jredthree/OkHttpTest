package com.jredthree.okhttptest.http;

/**
 * author: smart
 * time: 2016/11/15
 */

public class APIService implements API {
    private String urlAddress = "https://api.douban.com/v2/movie";

    private OkHttpHandler mOkHttpHandler = OkHttpHandler.getInstance();

    @Override
    public void getMovie(String id, OkHttpHandler.ResultCallback callback) {
        mOkHttpHandler.asynGet(urlAddress+("/subject/")
                +(id),callback);
    }

}
