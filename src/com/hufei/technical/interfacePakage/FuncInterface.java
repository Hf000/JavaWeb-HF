package com.hufei.technical.interfacePakage;

/**
 * @Author:hufei
 * @CreateTime:2020-07-29
 * @Description:测试函数接口
 */
@FunctionalInterface
public interface FuncInterface {

    void execute();

    static void executeStatic(){
        System.out.println("静态方法");
    }

    default void executeDefault() {
        System.out.println("默认方法");
    }

}
