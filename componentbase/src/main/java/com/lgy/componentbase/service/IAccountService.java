package com.lgy.componentbase.service;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 * 组件接口定义
 * 定义 Login 组件向外提供的数据的传递接口方法
 */
public interface IAccountService {
    boolean isLogin();

    String getAccountId();

    /**
     * 创建　UserFragment
     * @param mActivity
     * @param containerId
     * @param mFragmentManager
     * @param mBundle
     * @param tag
     * @return
     */
    Fragment newUserFragment(Activity mActivity, int containerId, FragmentManager mFragmentManager, Bundle mBundle, String tag);
}
