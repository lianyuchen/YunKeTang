package com.demo.yunketang.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.demo.yunketang.R;
import com.demo.yunketang.util.NetRequestUtil;
import com.loopj.android.http.RequestParams;

public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private TextView mTitle,tv_register;
    private ImageButton mBack;
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mTitle = (TextView) findViewById(R.id.tv_title);
        mTitle.setText("登录");
        mBack = (ImageButton) findViewById(R.id.ib_back);
        mBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

        init();
    }

    private void init() {
        etUsername = (EditText) findViewById(R.id.maina_user_login_et_username);
        etPassword = (EditText) findViewById(R.id.maina_user_login_et_password);
        btnLogin = (Button) findViewById(R.id.maina_user_login_btn_login);
        tv_register = (TextView)findViewById(R.id.maina_user_login_tv_register);
        initAdapter();
    }

    private void initAdapter() {
        tv_register.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.maina_user_login_tv_forget:
                break;
            case R.id.maina_user_login_btn_login:
                userLogin();

                break;
        }
    }

    private void userLogin() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        if (null != username && "".equals(username) && null != password && "".equals(password)){
            RequestParams params = new RequestParams();
            params.put("username", username);
            params.put("password", password);
            NetRequestUtil.requestUserLogin(params,NetRequestUtil.USER_LOGIN_URL);
        }
    }
}
