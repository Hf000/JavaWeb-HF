package com.hufei.util;

import java.util.HashMap;
import java.util.Map;

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
