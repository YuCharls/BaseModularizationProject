package com.example.yc.mvpdemo.common.presenter;

import com.example.yc.mvpdemo.common.activity.SlideMainActivity;
import mvpdemo.yc.example.com.model_common.base.BasePresenter;
import com.example.yc.mvpdemo.common.contract.SlideMainContract;

/**
 * Created by YuChao
 * com.example.yc.mvpdemo.common.presenter
 */

public class SlideMainPresenter extends BasePresenter<SlideMainActivity> implements
        SlideMainContract.SlideMainPresenter {

    private static final String TAG = "SlideMainPresenter";


    private int mSelectedTab;

    @Override
    public void showFragment(int viewId) {
        
    }
}
