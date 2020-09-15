package com.hufei.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:hufei
 * @CreateTime:2020-06-30
 * @Description:代理实例
 */
public class CGLIBProxyInstance implements MethodInterceptor {
    private Object instance;
    public CGLIBProxyInstance (Object obj) {
        this.instance = obj;
    }

    public CGLIBProxyInstance () {
    }

    /**
     * @param o             当前代理后的子类对象
     * @param method        当前代理被拦截的方法
     * @param objects       方法参数
     * @param methodProxy   代理目标类的代理方法对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        objects[0] = "参数测试" + objects[0];
        System.out.println("方法增强前");
//        Object o1 = method.invoke(instance, objects);           //方式一   这种是用没有增强过的对象进行调用
//        Object o2 = methodProxy.invokeSuper(o, objects);        //方式二   这里是用已经增强的子类对象进行调用
        Object invoke = methodProxy.invoke(instance, objects);    //同理方式一
        System.out.println("方法增强后");
//        return o2;
//        return o1;
        return invoke;
    }
}
