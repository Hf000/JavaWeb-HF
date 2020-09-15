package com.hufei.technical.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:hufei
 * @CreateTime:2020-06-30
 * @Description:代理实例
 */
public class ProxyInstance implements InvocationHandler {

    private Object obj;

    public ProxyInstance(Object o) {
        this.obj = o;
    }

    /**
     * @param proxy         目标对象
     * @param method        目标类对象需要执行的方法
     * @param args          方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        args[0] = "测试参数" + args[0];
        System.out.println("逻辑增强前");
        Object invoke = method.invoke(obj, args);
        System.out.println("逻辑增强后");
        return invoke;
    }
}
