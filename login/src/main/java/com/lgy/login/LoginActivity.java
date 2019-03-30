package com.lgy.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/account/login")
public class LoginActivity extends AppCompatActivity {

    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_login);
        initView();
        updateLoginState();
    }

    private void updateLoginState() {
        tvStatus.setText("这里是登录页面,当前状态为：" + (AccountUtils.userInfo == null ? "未登录" : AccountUtils.userInfo.getName()));
    }

    private void initView() {
        tvStatus = findViewById(R.id.tv_status);
    }

    public void login(View view) {
        AccountUtils.userInfo = new UserInfo("10086", "admin");
    }

    public void loginShare(View view) {
        ARouter.getInstance().build("/share/share")
                .withString("share_content", "分享数据到微博").navigation();
    }

    public void exit(View view) {
        AccountUtils.userInfo = null;
        updateLoginState();
    }
}
