package com.hufei.util;

import org.apache.commons.lang.StringUtils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @Author:hufei
 * @CreateTime:2020-08-05
 * @Description:加密工具类   实现:AES
 */
public class EncryptUtils {

    /**
     * AES加密方法
     * @param encodeRules   加密秘钥
     * @param content       需要加密的内容
     * @return 如果返回 "" 则加密失败, 否则加密成功
     */
    public static String aesEncrypt(String encodeRules, String content){
        try {
            if (StringUtils.isEmpty(content) || StringUtils.isEmpty(encodeRules)) return "";  //传入参数异常, 加密失败
            byte [] byte_content = content.getBytes("utf-8");//8.获取加密内容的字节数组(这里要设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
            byte[] byte_AES = aesPublic(encodeRules, byte_content, Cipher.ENCRYPT_MODE);//加密
            if (byte_AES == null) return "";
            return Base64Utils.byteToString(byte_AES);//10.将加密后的数据转换为字符串, 并返回加密成功后的字符串
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("加密失败!!!");
        }
        return "";//如果有错就返回一个空字符串
    }

    /**
     * AES 加密/解密公用方法
     * @param encodeRules       加密/解密 秘钥
     * @param byte_content      加密/解密 byte[] 内容
     * @param cipherInt         加密/解密 类型
     * @return  返回类型 byte[]
     * @throws Exception
     */
    public static byte[] aesPublic(String encodeRules, byte[] byte_content, int cipherInt) throws Exception {
        KeyGenerator keygen = KeyGenerator.getInstance("AES");//1.构造密钥生成器，指定为AES算法,不区分大小写
        keygen.init(128, new SecureRandom(encodeRules.getBytes()));//2.根据ecnodeRules规则初始化密钥生成器    生成一个128位的随机源,根据传入的字节数组
        SecretKey original_key = keygen.generateKey();//3.产生原始对称密钥
        byte [] raw = original_key.getEncoded();//4.获得原始对称密钥的字节数组
        SecretKey key = new SecretKeySpec(raw, "AES");//5.根据字节数组生成AES密钥
        Cipher cipher = Cipher.getInstance("AES");//6.根据指定算法AES生成密码器
        cipher.init(cipherInt, key);//7.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密解密(Decrypt_mode)操作，第二个参数为使用的KEY
        return cipher.doFinal(byte_content);//9.根据密码器的初始化方式--加密/解密：将数据加密/解密   并返回
    }

}
