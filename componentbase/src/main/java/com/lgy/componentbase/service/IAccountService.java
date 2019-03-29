package com.lgy.componentbase.service;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 * 组件接口定义
 * 定义 Login 组件向外提供的数据的传递接口方法
 */
public interface IAccountService {
    boolean isLogin();

    String getAccountId();
}
