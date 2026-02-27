package com.xyz.xyzassister

import android.app.Application
import android.util.Log
import rikka.shizuku.Shizuku

class XyzApplication : Application() {

    companion object {
        private const val TAG = "XyzApplication"
        private var instance: XyzApplication? = null
        
        fun getInstance(): XyzApplication? = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        Log.i(TAG, "应用程序启动")
    }

    override fun onTerminate() {
        super.onTerminate()
        instance = null
        Log.i(TAG, "应用程序终止完成")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.w(TAG, "系统内存不足")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.w(TAG, "系统要求释放内存，级别: $level")
    }
}