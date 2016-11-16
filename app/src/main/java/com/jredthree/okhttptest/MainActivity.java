package com.jredthree.okhttptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.jredthree.okhttptest.http.API;
import com.jredthree.okhttptest.http.APIService;
import com.jredthree.okhttptest.http.OkHttpHandler;

import okhttp3.Request;

public class MainActivity extends AppCompatActivity {
    protected API api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        api = new APIService();
        api.getMovie("26880771", new OkHttpHandler.ResultCallback<MovieBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Log.i("TAG","---onError--"+request+e.toString());
            }

            @Override
            public void onResponse(MovieBean response) {
                Log.i("TAG","---onResponse--"+response.getAlt()+"----"+response.getTitle());
            }

           /* @Override
            public void onResponse(String response) {
                Log.i("TAG","---onResponse--"+response);
            }*/


        });
    }
}
