package com.lgy.login;

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
}
