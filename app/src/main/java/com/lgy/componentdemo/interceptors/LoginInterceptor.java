package com.lgy.componentdemo.interceptors;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.lgy.componentbase.ServiceFactory;

/**
 * Author：lee
 * Data: 19-3-30 11:20
 * 自定义的过滤器需要通过 @Interceptor 来注解，priority 是优先级，name 是对这个拦截器的描述。
 * 以上代码中通过 Postcard 获取跳转的 path，然后通过 path 以及特定的需求来判断是否拦截，
 * 在这里是通过对登录状态的判断进行拦截，如果已经登录就继续跳转，如果未登录就拦截跳转。
 *
 */
@Interceptor(priority = 8, name = "登录状态拦截器")
public class LoginInterceptor implements IInterceptor {
    private Context mContext;

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        // onContinue 和 onInterrupt 至少需要调用其中一种，否则不会继续路由
        if (postcard.getPath().equals("/share/share")) {
            if (ServiceFactory.getInstance().getAccountService().isLogin()) {
                // 处理完成，交还控制权
                callback.onContinue(postcard);
            } else {
                // 中断路由流程
                callback.onInterrupt(new RuntimeException("请登录"));
            }
        } else {
            // 处理完成，交还控制权
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {
        // 拦截器的初始化，会在sdk初始化的时候调用该方法，仅会调用一次
        this.mContext = context;
    }
}
