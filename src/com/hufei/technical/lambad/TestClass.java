package com.hufei.technical.lambad;

import com.hufei.technical.interfacePakage.FuncInterface;

/**
 * @Author:hufei
 * @CreateTime:2020-07-09
 * @Description:测试类
 */
public class TestClass {

    /*
    * 抽取成方法的快捷键 ctrl+alt+m
    * 查看类方法快捷键 alt+7 或者 ctrl+f12
    * */
    public static void main(String[] args) {
        addTest01();
        addTest02();
        addTest03();
        Test test = new Test();
        test.method();
    }

    @org.junit.Test
    public void myTest() {
//        testDemo(new FuncInterface() {
//            @Override
//            public void execute() {
//                System.out.println("测试函数接口方法");
//            }
//
//            @Override
//            public void executeDefault() {
//                System.out.println("重写默认方法");
//            }
//        });

        testDemo(()->{
            System.out.println("Lambda测试函数接口方法");
        });
    }

    public void testDemo(FuncInterface face) {
        face.execute();
        face.executeDefault();
    }

    public static class Test {
        public void method() {
            System.out.println("内部类测试");
        }
    }

    private static void addTest03() {
        Integer a = 0;
        int b = 0;
        for (int i = 0; i < 99; i++) {
            a = a++;
            b = a++;
        }
        System.out.println(a);
        System.out.println(b);
    }

    private static void addTest02() {
        int a = 0;
        for (int i = 0; i < 99; i++) {
            a = ++a;
        }
        System.out.println(a);
    }

    private static void addTest01() {
        int a = 0;
        for (int i = 0; i < 99; i++) {
            a = a++;
        }
        System.out.println(a);
    }

}
