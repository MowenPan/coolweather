package com.pan.coolweather.util;

import android.util.Log;

import java.util.logging.Level;

/**
 * Created by Pan.
 * Create Time 2017/4/6.
 * E-mail pan.mowen@gmail.com
 */

public class LogUtil {
    public static final int VERBOSE = 1;
    public static final int DEBUG = 1;
    public static final int INFO = 1;
    public static final int WARN = 1;
    public static final int ERROR = 1;
    public static final int NOTHING = 1;

    public static int level = VERBOSE;

    public static void v(String tag,String msg){
        if (level <= VERBOSE){
            Log.v(tag,msg);
        }
    }

    public static void d(String tag,String msg){
        if (level <= DEBUG){
            Log.d(tag,msg);
        }
    }

    public static void i(String tag,String msg){
        if (level <= INFO){
            Log.i(tag,msg);
        }
    }

    public static void w(String tag,String msg){
        if (level <= WARN){
            Log.w(tag,msg);
        }
    }

    public static void e(String tag,String msg){
        if (level <= ERROR){
            Log.e(tag,msg);
        }
    }

}
