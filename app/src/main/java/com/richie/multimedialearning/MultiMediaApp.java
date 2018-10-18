package com.richie.multimedialearning;

import android.app.Application;
import android.content.Context;

import com.richie.easylog.LogConfig;

/**
 * @author Richie on 2018.10.17
 */
public class MultiMediaApp extends Application {
    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LogConfig.setLogcatEnabled(true);
        sContext = this;
    }
}