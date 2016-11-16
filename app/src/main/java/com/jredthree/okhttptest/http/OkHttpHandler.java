package com.jredthree.okhttptest.http;

import android.os.Handler;
import android.os.Looper;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.internal.$Gson$Types;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Request;
import okhttp3.Response;

/**
 * author: smart
 * time: 2016/11/15
 */

public class OkHttpHandler {
    private static OkHttpHandler mInstance;
    private OkHttpManager mOkHttpManager;
    private Handler mHandler;
    private Gson mGson;

    private OkHttpHandler(){
        mOkHttpManager = OkHttpManager.getInstance();
        mHandler = new Handler(Looper.getMainLooper());
        mGson = new Gson();
    }

    public static OkHttpHandler getInstance() {
        if (mInstance == null) {
            synchronized (OkHttpHandler.class) {
                if (mInstance == null) {
                    mInstance = new OkHttpHandler();
                }
            }
        }
        return mInstance;
    }

    public void asynGet(final String url , final ResultCallback callback){
        final Response[] response = {null};
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    response[0] = mOkHttpManager.getAsyn(url);
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    handleResult(response[0],callback);
                }
            }
        }).start();
    }


    public void asynPost(final String url , final String json, final ResultCallback callback){
        final Response[] response = {null};
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    response[0] = mOkHttpManager.postAsyn(url,json);
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    handleResult(response[0],callback);
                }
            }
        }).start();
    }

    public void asynPut(final String url , final String json, final ResultCallback callback){
        final Response[] response = {null};
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    response[0] = mOkHttpManager.putAsyn(url,json);
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    handleResult(response[0],callback);
                }
            }
        }).start();
    }

    private void handleResult(Response response,ResultCallback callback){
        String str = "";
        if(null == response) {
            sendFailedResponse(null,new MyException("空错误"),callback);
        } else {
            try {
                str = response.body().string();
                ErrorCodeBean errorCodeBean = mGson.fromJson(str, ErrorCodeBean.class);
                if(null != errorCodeBean && errorCodeBean.getError_code() != 0) {
                    sendFailedResponse(response.request(), new MyException(errorCodeBean.getError_message()), callback);
                }else{
                    if (callback.mType == String.class) {
                        sendSuccessResponse(str, callback);
                    }else{
                        Object o = mGson.fromJson(str, callback.mType);
                        sendSuccessResponse(o, callback);
                    }
                }
            }catch (JsonParseException e) {
                e.printStackTrace();
                if (callback.mType == String.class) {
                    sendSuccessResponse(str, callback);
                }else{
                    Object o = mGson.fromJson(str, callback.mType);
                    sendSuccessResponse(o, callback);
                }
            }catch (IOException e) {
                e.printStackTrace();
                sendFailedResponse(response.request(), e, callback);
            }
        }
    }


    private void sendSuccessResponse(final Object object, final ResultCallback callback){
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if(null != callback){
                    callback.onResponse(object);
                }
            }
        });
    }

    private void sendFailedResponse(final Request request, final Exception e, final ResultCallback callback){
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if(null != callback){
                    callback.onError(request,e);
                }
            }
        });
    }


    public static abstract class ResultCallback<T> {

        Type mType;

        public ResultCallback() {
            mType = getSuperclassTypeParameter(getClass());
        }

        static Type getSuperclassTypeParameter(Class<?> subclass) {
            Type superclass = subclass.getGenericSuperclass();
            if (superclass instanceof Class) {
                throw new RuntimeException("Missing type parameter.");
            }
            ParameterizedType parameterized = (ParameterizedType) superclass;
            return $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[0]);
        }

        public abstract void onError(Request request, Exception e);

        public abstract void onResponse(T response);
    }

}
