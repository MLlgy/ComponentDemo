package com.lgy.componentdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lgy.base.AppConfig;
import com.lgy.base.BaseApplication;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 */
public class HostApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug()) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
        initMoudleApp(this);
        initModuleData(this);
    }

    @Override
    public void initMoudleApp(Application application) {
        /**
         * 通过反射的形式，初始化组件 module 的Application
         */
        for (String applicationName : AppConfig.moduleApps) {
            try {
                Class clazz = Class.forName(applicationName);
                BaseApplication baseApp = (BaseApplication) clazz.newInstance();
                baseApp.initMoudleApp(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initModuleData(Application application) {
        /**
         * 通过反射的形式，初始化组件 module 的Application
         */
        for (String applicationName : AppConfig.moduleApps) {
            try {
                Class clazz = Class.forName(applicationName);
                BaseApplication baseApp = (BaseApplication) clazz.newInstance();
                baseApp.initModuleData(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
