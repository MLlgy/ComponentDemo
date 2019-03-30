package com.lgy.login;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Author：lee
 * Data: 19-3-30 11:39
 */
public class UserFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment_login, container, false);
        TextView mTextView = view.findViewById(R.id.tv_user_name);
        mTextView.setText(AccountUtils.userInfo == null ? "用户未登录" : "登录的用户为：" + AccountUtils.userInfo.getName());
        return view;
    }
}
