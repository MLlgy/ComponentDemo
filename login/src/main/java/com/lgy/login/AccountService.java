package com.lgy.login;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.lgy.componentbase.service.IAccountService;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 */
public class AccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }

    @Override
    public Fragment newUserFragment(Activity mActivity, int containerId, FragmentManager mFragmentManager, Bundle mBundle, String tag) {
        FragmentTransaction mTransaction = mFragmentManager.beginTransaction();
        Fragment userFragment = new UserFragment();
        mTransaction.add(containerId,userFragment,tag);
        mTransaction.commit();
        return userFragment;
    }
}
