package mvpdemo.yc.example.com.config;


import com.alibaba.android.arouter.launcher.ARouter;
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

        if (true) {
            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);

        //内存泄漏检测
        LeakCanary.install(this);

        
    }

}
