package com.example.yc.mvpdemo.empty.fragment;


import android.view.View;

import com.example.yc.mvpdemo.empty.R;
import mvpdemo.yc.example.com.model_common.base.BaseFragment;
import mvpdemo.yc.example.com.model_common.base.BasePresenter;

/**
 * Created by YuChao
 */

public class Fragment2 extends BaseFragment {
    
    @Override
    protected int getFragmentLayoutId() {
        return R.layout.fragment2;
    }

    @Override
    protected void initView(View rootView) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void getViewOnClick(int viewId) {

    }

    @Override
    protected BasePresenter getLoadPresenter() {
        return null;
    }
}
