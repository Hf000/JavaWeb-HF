package com.hufei.technical.lambad;

/**
 * @Author:hufei
 * @CreateTime:2020-07-29
 * @Description:测试jdk1.8接口的特性
 */
public interface TestInterface {

    default void method01() {
        System.out.println("默认方法1");
    }

    void method02();

    static void method03() {
        System.out.println("静态方法01");
    }

    default void method04() {
        System.out.println("默认方法02");
    }

    static void method05() {
        System.out.println("静态方法02");
    }

//    void method06();

    public static void main(String[] args) {
        TestInterface.method03();
        TestInterface.method05();
    }

}
