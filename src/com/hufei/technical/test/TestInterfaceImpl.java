package com.hufei.technical.test;

/**
 * @Author:hufei
 * @CreateTime:2020-07-29
 * @Description:测试
 */
public class TestInterfaceImpl implements TestInterface {
    @Override
    public void method02() {
        System.out.println("接口中的抽象方法");
    }

    public static void main(String[] args) {
        TestInterface test = new TestInterfaceImpl();
//        TestInterfaceImpl test = new TestInterfaceImpl();
        test.method01();
    }
}
