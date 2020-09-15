package com.hufei.util;

import org.apache.commons.lang.StringUtils;

import javax.crypto.Cipher;

/**
 * @Author:hufei
 * @CreateTime:2020-08-05
 * @Description:解密工具类   实现:AES
 */
public class DecodeUtils {

    /**
     * AES 解密方法
     * @param encodeRules       解密秘钥
     * @param content           解密的内容
     * @return 如果返回 "" 则解密失败, 否则解密成功
     */
    public static String aesDecode(String encodeRules, String content){
        try {
            if (StringUtils.isEmpty(content) || StringUtils.isEmpty(encodeRules)) return "";  //传入参数异常, 加密失败
            byte [] byte_content = Base64Utils.stringToByte(content);//8.将加密并编码后的内容解码成字节数组
            if(byte_content == null) return "";
            byte[] byte_AES = EncryptUtils.aesPublic(encodeRules, byte_content, Cipher.DECRYPT_MODE);//解密
            if (byte_AES == null) return "";
            return new String(byte_AES,"utf-8");//10.将解密后的数据转换成字符串, 并返回
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";//如果有错就返加 ""
    }

}
