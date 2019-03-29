package com.lgy.login;

import android.app.Application;

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
        initMoudleApp(this);
        initModuleData(this);
    }

    @Override
    public void initMoudleApp(Application application) {
        //将 AccountService 实例对象注册到 ServiceFactory
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
