package com.lgy.componentbase;

import com.lgy.componentbase.empty_service.EmptyAccountService;
import com.lgy.componentbase.service.IAccountService;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 * Service 工厂
 */
public class ServiceFactory {
    private IAccountService accountService;

    /**
     * 构造器为 private 禁止构造 ServiceFactory 对象
     */
    private ServiceFactory() {
    }

    /**
     * 通过内部类获得单例
     *
     * @return
     */
    public static ServiceFactory getInstance() {
        return Inner.serviceFactory;
    }

    private static class Inner {
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }


    /**
     * 接收 Login 组件实现的 Service 实现
     *
     * @param accountService
     */
    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 返回 Login 组件的 Service 实现
     *
     * @return
     */
    public IAccountService getAccountService() {
        if (accountService == null) {
            accountService = new EmptyAccountService();
        }
        return accountService;
    }
}
