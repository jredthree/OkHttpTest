package com.jredthree.okhttptest.http;

/**
 * author: smart
 * time: 2016/11/15
 */

public interface API {
   void getMovie(String id, OkHttpHandler.ResultCallback callback);
}
