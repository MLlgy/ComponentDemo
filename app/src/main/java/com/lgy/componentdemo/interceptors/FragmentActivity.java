package com.lgy.componentdemo.interceptors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lgy.componentdemo.R;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
