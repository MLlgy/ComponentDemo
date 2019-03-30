package com.lgy.componentbase.empty_service;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.lgy.componentbase.service.IAccountService;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 * 组件 Service 空实现
 */
public class EmptyAccountService implements IAccountService {
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
        return null;
    }
}
