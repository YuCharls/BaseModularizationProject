package com.example.yc.mvpdemo.empty.presenter;

import com.example.yc.mvpdemo.empty.model.TestEmptyModel;
import com.example.yc.mvpdemo.empty.activity.TestEmptyActivity;
import mvpdemo.yc.example.com.model_common.base.BasePresenter;
import com.example.yc.mvpdemo.empty.bean.TestBean;
import com.example.yc.mvpdemo.empty.contract.TestEmptyContract;

import mvpdemo.yc.example.com.model_common.utils.LogUtil;

/**
 * Created by YuChao
 * com.example.yc.mvpdemo.common.presenter
 */

public class TestEmptyPresenter extends BasePresenter<TestEmptyActivity> implements
        TestEmptyContract.TestPresenter {
    private static final String TAG = "LoginPresenter";

    @Override
    public void clickTest(String month, String day) {
        TestEmptyModel mTestModel = new TestEmptyModel();
        mTestModel.testModel(month, day, new TestEmptyModel.InfoHint() {
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
