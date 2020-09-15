package com.hufei.proxy.cglib;

/**
 * @Author:hufei
 * @CreateTime:2020-06-30
 * @Description:目标类
 */
public class TargetInstance {

    public void method(String param) {
        System.out.println("cglib代理:参数"+param);
    }
}
