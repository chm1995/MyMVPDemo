package com.example.zxnet.mymvpdome.view;

/**
 * Created by 陈海明 on 2016/11/22.
 */

public interface LoginView {

    public static final String TAG="LoginView";

    String getUser();
    String getPassword();

    /**
     * 处理用户名没有输入为空
     */
    void onUserNameError();

    /**
     * 处理密码没有输入为空
     */
    void onPwdError();

    /**
     * 处理用户密码输入错误
     */
    void onError();

    /**
     * 成功登录
     */
    void onSuccess();
}
