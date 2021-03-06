package com.example.yc.mvpdemo.empty.debug;


import com.squareup.leakcanary.LeakCanary;

import mvpdemo.yc.example.com.model_common.base.BaseApplication;

/**
 * Created by YuChao
 * 应用,主要用来做一下初始化的操作
 */

public class ProApplication extends BaseApplication {
    
    @Override
    public void onCreate() {
        super.onCreate();
        
        initManager();

    }
    


    private void initManager() {
        //内存泄漏检测
        LeakCanary.install(this);
        
    }

}
