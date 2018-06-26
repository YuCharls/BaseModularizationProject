package com.example.yc.mvpdemo.common.presenter;

import mvpdemo.yc.example.com.model_common.base.BasePresenter;
import com.example.yc.mvpdemo.common.bean.LoginResponseBean;
import com.example.yc.mvpdemo.common.contract.Fragment1Contract;
import com.example.yc.mvpdemo.common.fragment.Fragment1;
import com.example.yc.mvpdemo.common.model.LoginModel;

/**
 * Created by YuChao on 2017/6/11.
 */

public class Fragment1Presenter extends BasePresenter<Fragment1> implements
        Fragment1Contract.Fragment1Presenter {


    @Override
    public void clickButton(String phone, String password) {

        LoginModel fragmentLogin = new LoginModel();

        fragmentLogin.login(phone, password, new LoginModel.InfoHint() {
            @Override
            public void successInfo(LoginResponseBean str) {
                getIView().successInfo(str);
            }

            @Override
            public void failInfo(String str) {
                getIView().failInfo(str);
            }
        });

    }
}
