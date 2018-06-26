package mvpdemo.yc.example.com.model_common.subscriber;

import android.content.Context;

import io.reactivex.disposables.Disposable;
import mvpdemo.yc.example.com.model_common.base.BaseApplication;
import mvpdemo.yc.example.com.model_common.base.BaseSubscriber;
import mvpdemo.yc.example.com.model_common.exception.ApiException;
import mvpdemo.yc.example.com.model_common.utils.LogUtil;


/**
 * Created by YuChao
 * com.example.yc.myapplication.subscriber
 * <p>
 * 普通订阅者 的类
 */

public abstract class CommonSubscriber<T> extends BaseSubscriber<T> {

    private static final String TAG = "CommonSubscriber";

    protected CommonSubscriber(T t) {
        super(t);
    }

    @Override
    public void onNext(String jsonString) {
        super.onNext(jsonString);
    }
    

    @Override
    protected void onError(ApiException e) {
        LogUtil.e(TAG, "错误信息为 " + "code:" + e.code + "   message:" + e.message);
    }

    @Override
    public void onSubscribe(Disposable d) {
        
    }

    @Override
    public void onComplete() {

    }

    //
//    @Override
//    public void onStart() {
//        if (!NetworkUtil.isNetworkAvailable(context)) {
//            LogUtil.e(TAG, "网络不可用");
//        } else {
//            LogUtil.e(TAG, "网络可用");
//        }
//    }
//
//
//    @Override
//    protected void onError(ApiException e) {
//
//        LogUtil.e(TAG, "错误信息为 " + "code:" + e.code + "   message:" + e.message);
//    }
//
//
//    @Override
//    public void onCompleted() {
//        LogUtil.e(TAG, "成功了");
//    }

}
