package com.hufei.util;

/**
 * @Author:hufei
 * @CreateTime:2020-09-15
 * @Description:测试实例
 */
public class TestExample {
    public static void main(String[] args) {//https://qiuniu.zhaopingou.com/
        EncAndDecTest();
    }

    private static void EncAndDecTest() {
        //加密
        System.out.println(EncryptUtils.aesEncrypt("zpgAESencryptRules", "resume/358276D2B8A54EB4B7E65596EC589C142019112016334754857.png"));
        //解密
        System.out.println(DecodeUtils.aesDecode("zpgAESencryptRules", "z5WYz6zfKTwNukExNux3bkjYGwYEtLFAEQxdB+xSxxba5QvNS4PCPKoi2ANYMSXVFInIpQq4WsqXDgaupTMdWw=="));
    }
}
