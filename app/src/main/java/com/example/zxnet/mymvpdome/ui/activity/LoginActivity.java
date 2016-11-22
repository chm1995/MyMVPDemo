package com.example.zxnet.mymvpdome.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zxnet.mymvpdome.R;
import com.example.zxnet.mymvpdome.presenter.LoginPresenter;
import com.example.zxnet.mymvpdome.presenter.impl.LoginPresenterImpl;
import com.example.zxnet.mymvpdome.view.LoginView;

/**
 * Created by 陈海明 on 2016/11/22.
 */

public class LoginActivity extends AppCompatActivity implements LoginView{

    public static final String TAG="LoginActivity";

    private Button btn_login;
    private EditText name,pwd;
    private LoginPresenter mloginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initview();
    }

    private void initview() {
        name= (EditText) findViewById(R.id.name);
        pwd= (EditText) findViewById(R.id.pwd);
        btn_login=(Button) findViewById(R.id.btn_login);
        mloginPresenter = new LoginPresenterImpl(this);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mloginPresenter.login();
            }
        });
    }

    @Override
    public String getUser() {
        return name.getText().toString();
    }

    @Override
    public String getPassword() {
        return pwd.getText().toString();
    }

    @Override
    public void onUserNameError() {
        name.setError("用户名不能为空");
    }

    @Override
    public void onPwdError() {
        pwd.setError("密码不能为空");
    }

    @Override
    public void onError() {
        Toast.makeText(this, "密码错误", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
    }
}
