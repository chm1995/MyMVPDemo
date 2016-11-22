package com.example.zxnet.mymvpdome.presenter.impl;

import android.text.TextUtils;

import com.example.zxnet.mymvpdome.presenter.LoginPresenter;
import com.example.zxnet.mymvpdome.view.LoginView;

/**
 * Created by 陈海明 on 2016/11/22.
 */

public class LoginPresenterImpl implements LoginPresenter {

    public static final String TAG = "LoginPresenterImpl";
    /**
     * VIEW层，与Presenter进行信息交互
     */
    public LoginView mLoginView;

    public LoginPresenterImpl(LoginView mLoginView) {
        this.mLoginView = mLoginView;
    }
    @Override
    public void login() {

        if (TextUtils.isEmpty(mLoginView.getUser())) {
            mLoginView.onUserNameError();
            return;
        }
        if (TextUtils.isEmpty(mLoginView.getPassword())) {
            mLoginView.onPwdError();
            return;
        }
        if ("123".equals(mLoginView.getPassword())) {

          mLoginView.onSuccess();

        } else {
            mLoginView.onError();
            return;
        }
    }
}
