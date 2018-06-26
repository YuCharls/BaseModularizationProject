package com.example.yc.mvpdemo.common.model;

import android.support.annotation.NonNull;

import mvpdemo.yc.example.com.model_common.base.BaseApplication;
import mvpdemo.yc.example.com.model_common.base.BaseModel;

import com.example.yc.mvpdemo.common.bean.TestBean;

import mvpdemo.yc.example.com.model_common.exception.ApiException;
import mvpdemo.yc.example.com.model_common.subscriber.CommonSubscriber;
import mvpdemo.yc.example.com.model_common.transformer.CommonTransformer;
import mvpdemo.yc.example.com.model_common.utils.LogUtil;

import java.util.HashMap;

import io.reactivex.disposables.Disposable;
import okhttp3.RequestBody;

/**
 * Created by YuChao
 * <p>
 * com.example.yc.mvpdemo.common.model
 * <p>
 * 主要做一些数据处理呀,网路请求呀
 * 依然是业务逻辑和实体模型
 */

public class TestModel extends BaseModel {


    private static final String TAG = "LoginModel";

    private boolean isLogin = false;

    private RequestBody body;

    public boolean testModel(@NonNull String month,
                             @NonNull String day,
                             @NonNull final InfoHint infoHint) {

        if (infoHint == null) {
            throw new RuntimeException("InfoHint不能为空");
        }

        HashMap<String, String> params = new HashMap<>();
        params.put("v", "1");
        params.put("month", month);
        params.put("day", day);
        params.put("key", "c583b7e7f822c199c2ec65025b322511");

        httpService.loginPost(params)
                .compose(new CommonTransformer<String>())
                .subscribe(new CommonSubscriber<TestBean>(new TestBean()) {

                    @Override
                    public void onSuccess(TestBean mTestBean) {
                        LogUtil.i(TAG, ",onNext: " + mTestBean.toString());

                        isLogin = true;
                        infoHint.successInfo(mTestBean);//推荐者层 成功回调
                    }

                    @Override
                    protected void onError(ApiException e) {
                        super.onError(e);

                        isLogin = false;
                        infoHint.failInfo(e.message);//推荐者层 失败回调
                    }
                });
        return isLogin;
    }


    //通过接口产生信息回调
    public interface InfoHint {

        void successInfo(TestBean str);

        void failInfo(String str);

    }

}
