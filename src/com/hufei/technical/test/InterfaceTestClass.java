package com.hufei.technical.test;

/**
 * @Author:hufei
 * @CreateTime:2020-07-29
 * @Description:测试类
 */
public class InterfaceTestClass {

    public static void main(String[] args) {
        InfoInterface inter = () -> {
            System.out.println("测试");
        };//lambda表达式方式实现
        inter.method();

        InfoInterface test = new InfoInterface() {
            @Override
            public void method() {
                System.out.println("内部类测试");
            }
        };  //匿名内部类方式实现
        test.method();
    }

}
