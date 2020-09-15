package com.hufei.proxy.jdk;

/**
 * @Author:hufei
 * @CreateTime:2020-06-30
 * @Description:目标实例
 */
public class TargetInstance implements TargetInterface, TargetHandler {

    @Override
    public void method(String param) {
        System.out.println("目标动作!!! 参数" + param);
    }

    @Override
    public void method2(String param) {
        System.out.println("第二个实现类测试"+param);
    }
}
