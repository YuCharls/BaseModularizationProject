package com.example.yc.mvpdemo.main.presenter;

import com.example.yc.mvpdemo.main.activity.TestActivity;
import mvpdemo.yc.example.com.model_common.base.BasePresenter;
import com.example.yc.mvpdemo.main.bean.TestBean;
import com.example.yc.mvpdemo.main.contract.TestContract;
import com.example.yc.mvpdemo.main.model.TestModel;
import mvpdemo.yc.example.com.model_common.utils.LogUtil;

/**
 * Created by YuChao
 * com.example.yc.mvpdemo.common.presenter
 */

public class TestPresenter extends BasePresenter<TestActivity> implements
        TestContract.TestPresenter {
    private static final String TAG = "LoginPresenter";

    @Override
    public void clickTest(String month, String day) {
        TestModel mTestModel = new TestModel();
        mTestModel.testModel(month, day, new TestModel.InfoHint() {
            @Override
            public void successInfo(TestBean mTestBean) {
                getIView().onSuccess(mTestBean);  //视图层 成功 回调
            }

            @Override
            public void failInfo(String str) {
                LogUtil.e("LoginPresenter.failInfo", str);
                getIView().onFail(str);  //视图层 失败 回调
            }
        });
        
    }


}
