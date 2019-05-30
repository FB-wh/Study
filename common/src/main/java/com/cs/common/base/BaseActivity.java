package com.cs.common.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import okhttp3.OkHttpClient;


/**
 * author : ChenSen
 * data : 2019/5/30
 * desc:
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OkHttpClient client = new OkHttpClient();
    }

    protected void log(String msg) {
        Log.d("tag", msg);
    }

    protected void loge(String msg) {
        Log.e("tag", msg);
    }

    protected void log(String tag, String msg) {
        Log.d(tag, msg);
    }

}
