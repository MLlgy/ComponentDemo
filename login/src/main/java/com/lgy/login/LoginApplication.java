package com.lgy.login;

import com.lgy.base.BaseApplication;
import com.lgy.componentbase.ServiceFactory;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 */
public class LoginApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 将 AccountService 实例对象注册到 ServiceFactory
         */
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }
}
