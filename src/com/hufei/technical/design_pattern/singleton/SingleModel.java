package com.hufei.technical.design_pattern.singleton;

/**
 * @Author:hufei
 * @CreateTime:2020-06-30
 * @Description:单例模式
 */
public class SingleModel {

    private static volatile SingleModel single = null;   //定义成员变量, 增加volatile修饰字段, 是为了保证防止jvm重排指令, 使当前对象对所有线程可见

    private SingleModel() { //私有化构造方法
    }

    public static SingleModel getInstance() {
        if (single == null) {                       //判断是否已经创建对象, 此处多加为null判断是为了减少线程阻塞, 提高性能
            synchronized (SingleModel.class) {      //增加同步锁, 保证不出现并发, 多次创建对象
                if(single == null) {                //判空, 保证创建对象的唯一
                    single = new SingleModel();
                }
            }
        }
        return single;
    }

}
