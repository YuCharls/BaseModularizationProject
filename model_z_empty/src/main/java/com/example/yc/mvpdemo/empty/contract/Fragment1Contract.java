package com.example.yc.mvpdemo.empty.contract;


import com.example.yc.mvpdemo.empty.bean.TestBean;

/**
 * Created by YuChao on 2017/6/11.
 */

public class Fragment1Contract {

    public interface Fragment1View {
        void successInfo(TestBean str);

        void failInfo(String str);
    }

    public interface Fragment1Presenter {

        void clickButton(String phone, String password);
    }

}
