package com.hufei.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * @Author:hufei
 * @CreateTime:2020-06-30
 * @Description:jdk动态代理测试类
 */
public class JDKDynamicTest {

    public static void main(String[] args) {
        saveProxyFile();
        TargetInstance t = new TargetInstance();   //jdk动态代理必须至少实现一个接口
        ProxyInstance p = new ProxyInstance(t);     //创建代理对象实例
        TargetHandler o = (TargetHandler) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), p);//返回的代理对象必须使用目标对象的实现的接口对象接收, 否则报错, 根据源码找到生成的字节码文件的对象为接口对象
        o.method("hf");
    }

    /**
     * 保存 JDK 动态代理生产的类
     * @param filePath 保存路径，默认在项目路径下生成 $Proxy0.class 文件
     */
    private static void saveProxyFile(String... filePath) {
        if (filePath.length == 0) {
            System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        } else {
            FileOutputStream out = null;
            try {
                byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", TargetInstance.class.getInterfaces());
                out = new FileOutputStream(filePath[0] + "$Proxy0.class");
                out.write(classFile);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (out != null) {
                        out.flush();
                        out.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
