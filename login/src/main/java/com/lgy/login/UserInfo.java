package com.lgy.login;

/**
 * Author: GY.LEE
 * Date: 2019/3/29
 */
public class UserInfo {
    private String accountId;
    private String name;

    public UserInfo(String accountId, String name) {
        this.accountId = accountId;
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
