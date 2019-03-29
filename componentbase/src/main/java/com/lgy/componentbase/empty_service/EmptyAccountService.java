package com.lgy.componentbase.empty_service;

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
}
