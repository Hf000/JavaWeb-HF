package com.hufei.technical.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Author:hufei
 * @CreateTime:2020-06-30
 * @Description:cglib动态代理测试类
 */
public class CGLIBProxyTest {
    public static void main(String[] args) {
        TargetInstance t2 = (TargetInstance) Enhancer.create(TargetInstance.class, new CGLIBProxyInstance(new TargetInstance()));//创建代理实例
//        Enhancer enhancer = new Enhancer();         //另外一种创建代理实例方式
//        enhancer.setClassLoader(TargetInstance.class.getClassLoader());
//        enhancer.setSuperclass(TargetInstance.class);
//        enhancer.setCallback(new CGLIBProxyInstance());
//        TargetInstance t2 = (TargetInstance)enhancer.create();
        t2.method("hf");
    }
}
