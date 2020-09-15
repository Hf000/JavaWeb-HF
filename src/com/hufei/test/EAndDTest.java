package com.hufei.test;

import com.hufei.util.DecodeUtils;
import com.hufei.util.EncryptUtils;

/**
 * @Author:hufei
 * @CreateTime:2020-08-05
 * @Description:加密解密测试类
 */
public class EAndDTest {

    public static void main(String[] args) {//https://qiuniu.zhaopingou.com/
        System.out.println(EncryptUtils.aesEncrypt("zpgAESencryptRules", "resume/358276D2B8A54EB4B7E65596EC589C142019112016334754857.png"));
        System.out.println(DecodeUtils.aesDecode("zpgAESencryptRules", "z5WYz6zfKTwNukExNux3bkjYGwYEtLFAEQxdB+xSxxba5QvNS4PCPKoi2ANYMSXVFInIpQq4WsqXDgaupTMdWw=="));
    }

}
