package com.example.yc.mvpdemo.empty.activity;

import android.support.v7.widget.AppCompatButton;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.yc.mvpdemo.empty.bean.TestBean;
import com.example.yc.mvpdemo.empty.contract.TestEmptyContract;
import com.example.yc.mvpdemo.empty.presenter.TestEmptyPresenter;
import com.example.yc.mvpdemo.empty.R;
import com.google.gson.Gson;

import mvpdemo.yc.example.com.model_common.base.BaseActiviy;
import mvpdemo.yc.example.com.model_common.mvp.IView;
import mvpdemo.yc.example.com.model_common.utils.LogUtil;

/**
 * 最开始页面
 * <p>
 * Created by YuChao
 * <p>
 */
@Route(path = "/model_z_empty/test")
public class TestEmptyActivity extends BaseActiviy<TestEmptyPresenter>
        implements TestEmptyContract.TestView, IView {

    private static final String TAG = "TestEmptyActivity";

    EditText inputMonth;
    EditText inputDay;
    AppCompatButton btnClick;

    /**
     * 初始化 布局
     *
     * @return 布局id
     */
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    /**
     * 初始化 视图
     */
    @Override
    protected void initView() {
        inputMonth = getViewById(R.id.input_month);
        inputDay = getViewById(R.id.input_day);
        btnClick = getViewById(R.id.btn_click);

    }

    /**
     * 初始化 数据
     */
    @Override
    protected void initData() {
        LogUtil.i(TAG, ",initData: 测试:" + getResources().getText(R.string.empty_app_name_my));
    }

    /**
     * 初始化 监听
     */
    @Override
    protected void initListener() {
        btnClick.setOnClickListener(this);
    }

    /**
     * 得到  点击事件的id
     *
     * @param viewId 点击事件的id
     */
    @Override
    protected void getViewOnClick(int viewId) {
        if (viewId == R.id.btn_click) {
            LogUtil.i(TAG, ",getViewOnClick: " + getMonth() + getMonth());
            //调用 推荐者中的 登录业务方法
            mPresenter.clickTest(getMonth(), getDay());


        }
    }

    /**
     * 登录 处理逻辑层
     *
     * @return 登录的 逻辑类
     */
    @Override
    protected TestEmptyPresenter getLoadPresenter() {
        TestEmptyPresenter mTestPresenter;
        mTestPresenter = new TestEmptyPresenter();
        return mTestPresenter;
    }

    @Override
    public String getMonth() {
        String inputMonth;
        inputMonth = this.inputMonth.getText().toString().trim();
        return inputMonth;
    }

    @Override
    public String getDay() {
        String inputDay;
        inputDay = this.inputDay.getText().toString().trim();
        return inputDay;
    }

    /**
     * 请求成功 返回的数据
     *
     * @param beanStr 响应数据Bean对应的数据
     */
    @Override
    public void onSuccess(TestBean beanStr) {
        mToast(new Gson().toJson(beanStr));
    }

    /**
     * 请求失败 返回的数据
     *
     * @param failMsg 响应数据
     */
    @Override
    public void onFail(String failMsg) {
        mToast(failMsg);
    }

}
