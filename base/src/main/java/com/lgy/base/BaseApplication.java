package com.lgy.base;

import android.app.Application;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 */
public abstract class BaseApplication extends Application {
    /**
     * Application 的初始化
     */
    public abstract void initMoudleApp(Application application);

    /**
     * 所有的 Application 初始化后的自定义操作
     * @param application
     */
    public abstract void initModuleData(Application application);
}
