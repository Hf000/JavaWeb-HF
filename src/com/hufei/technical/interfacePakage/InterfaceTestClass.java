package com.hufei.technical.interfacePakage;

import com.hufei.technical.lambad.TestInterface;

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

    public static void interfaceTest() {
        TestInterface test = () -> {
            System.out.println("测试这里重写的是哪个方法");
        };
        test.method01();
        test.method02();
        test.method04();
    }

}
