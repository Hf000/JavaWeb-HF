package com.hufei.technical.test;

import com.hufei.util.JsonUtils;
import com.hufei.util.MapUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:hufei
 * @CreateTime:2020-07-09
 * @Description:测试类
 */
public class TestClass {

    public static void main(String[] args) {
//        test01();
//        test02();//抽取成方法的快捷键 ctrl+alt+m
//        testThreadPool();
//        testLock(); //查看类方法快捷键 alt+7 或者 ctrl+f12
//        testAtomic();
//        addTest01();
//        addTest02();
//        addTest03();
//        Test test = new Test();
//        test.method();
        interfaceTest();
    }

    public static void interfaceTest() {
        TestInterface test = () -> {
            System.out.println("测试这里重写的是哪个方法");
        };
        test.method01();
        test.method02();
        test.method04();
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

    private static void testAtomic() {
        AtomicInteger i = new AtomicInteger(0);
        for (int j = 0; j < 10; j++) {
            i.incrementAndGet();
        }
        System.out.println(i);
    }

    private static void testLock() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
    }

    private static void testThreadPool() {
        ExecutorService service = Executors.newFixedThreadPool(5);  //创建线程池
    }

    private static void test01() {
        String jsonStr = "{\"name\":\"张三\",\"gender\":\"男\",\"phone\":\"13457946412\"}";
        Map<String, Object> map = JsonUtils.jsonStrToMap(jsonStr);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }
    }

    private static void test02() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("张三", 123456);
        map.put("李四", 123456);
        map.put("王五", 123456);
        map.put("赵六", 123456);
        map.put("周七", 123456);
        Map<String, Object> map1 = MapUtils.removeMapElement(map, "周七", 1);
        for (Map.Entry<String, Object> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }
    }

}
