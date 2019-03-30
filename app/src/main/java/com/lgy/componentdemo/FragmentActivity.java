package com.lgy.componentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lgy.componentbase.ServiceFactory;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_acitivity);
        ServiceFactory.getInstance().getAccountService().newUserFragment(this, R.id.layout_fragment, getSupportFragmentManager(), null, "");
    }
}
