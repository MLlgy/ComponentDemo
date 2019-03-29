package com.lgy.share;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lgy.componentbase.ServiceFactory;

@Route(path = "/share/share")
public class ShareActivity extends AppCompatActivity {

    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        initView();
        initDate();

        share();
    }

    private void initDate() {
        if(getIntent() != null){
            String content = getIntent().getStringExtra("share_content");
            if(!TextUtils.isEmpty(content)){
                tvStatus.setText(content);
            }
        }
    }


    private void initView() {
        tvStatus = findViewById(R.id.share_content);
    }

    private void share() {
        if (ServiceFactory.getInstance().getAccountService().isLogin()) {
            Toast.makeText(this, "分享成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "分享失败：登录失败", Toast.LENGTH_SHORT).show();

        }
    }
}
