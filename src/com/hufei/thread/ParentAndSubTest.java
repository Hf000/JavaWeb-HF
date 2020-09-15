package com.hufei.thread;

/**
 * @Author:hufei
 * @CreateTime:2020-08-04
 * @Description:父子线程测试
 */
public class ParentAndSubTest {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(()->System.out.println("JVM 退出了")));//设置一个钩子线程 : 就是当JVM要退出的时候该线程就会被执行;
        Thread t = new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程输出");
        });
        t.setDaemon(true);// 将线程设置为守护线程, 守护线程特征: 可以自动结束自己的声明周期, 而非守护线程不可以.
        t.start();
        System.out.println("父线程输出");
        //结论, 如果子线程不是守护线程, 那么父线程会等字线程执行完成才结束;   如果子线程是守护线程, 那么父线程执行完就结束, 如果此时子线程还没有执行完也会被结束掉.
    }

}
