package com.example.yc.mvpdemo.empty.contract;

import com.example.yc.mvpdemo.empty.bean.TestBean;

/**
 * Created by YuChao
 * com.example.yc.mvpdemo.common.contract
 * 契约类,定义登录用到的一些接口方法
 */

public class TestEmptyContract {

    public interface TestView {
        String getMonth();

        String getDay();

        void onSuccess(TestBean beanStr);

        void onFail(String failMsg);
    }


    public interface TestPresenter {
        /**
         * 登录 业务逻辑
         *
         * @param name 姓名
         * @param pwd  密码
         */
        void clickTest(String name, String pwd);
    }
}
