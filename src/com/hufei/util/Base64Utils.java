package com.hufei.util;

import org.apache.commons.lang.StringUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * @Author:hufei
 * @CreateTime:2020-08-05
 * @Description:base64工具类
 */
public class Base64Utils {

    /**
     * 将byte[] 转换成 String
     * @param bytes 需要转换的 byte[]
     * @return 如果返回结果为 "" 则转换失败, 否则成功
     */
    public static String byteToString(byte[] bytes) {
        try {
            if (bytes == null || bytes.length < 1) return "";  //传入参数异常, 转换异常
            return new BASE64Encoder().encode(bytes);//将byte数据转换为字符串 并返回
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("byte[] 转换 String 失败!!!");
        }
        return "";
    }

    /**
     * 将 String 转换成 byte[]
     * @param content 需要转换的 String
     * @return 如果返回结果为 "" 则转换失败, 否则成功
     */
    public static byte[] stringToByte(String content) {
        try {
            if (StringUtils.isEmpty(content)) return null;  //传入参数异常, 转换异常
            return new BASE64Decoder().decodeBuffer(content);//将byte数据转换为字符串 并返回
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("String 转换 byte[] 失败!!!");
        }
        return null;
    }
}
