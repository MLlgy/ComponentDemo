package com.lgy.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lgy.componentbase.ServiceFactory;

/**
 * 通过　Ｓｅｒｖｉｃｅ　获得组件中的　Ｆｒａｇｍｅｎｔ，但是需要一个　Activity 为容器，这里的容器　Activity　为　FragmentActivity
 */
public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_acitivity);
        ServiceFactory.getInstance().getAccountService().newUserFragment(this, R.id.layout_fragment, getSupportFragmentManager(), null, "");
    }
}
