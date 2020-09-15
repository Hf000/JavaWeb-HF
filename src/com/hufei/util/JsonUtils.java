package com.hufei.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @Author:hufei
 * @CreateTime:2020-07-09
 * @Description:json工具类
 */
public class JsonUtils {

    /**
     * 将json字符串转换成Map集合
     * @param jsonStr
     * @return
     */
    public static Map<String, Object> jsonStrToMap(String jsonStr) {
        Map<String, Object> map = null;
        try {
            if (StringUtils.isNoneBlank(jsonStr)) {
                JSONObject jsonObject = JSONObject.fromObject(jsonStr);
                if (jsonObject != null) {
                    map = new HashMap<String, Object>();
                    for (Iterator<?> iter = jsonObject.keys(); iter.hasNext();) {
                        String key = (String) iter.next();
                        String value = jsonObject.get(key).toString();
                        map.put(key, value);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 将json字符串转换成List<Map<K, V>>集合necessary
     * @param jsonStr
     * @return
     */
    public static List<Map<String, Object>> jsonStrToList(String jsonStr) {
        List<Map<String, Object>> rsList = null;
        try {
            if (StringUtils.isNoneBlank(jsonStr)) {
                JSONArray arry = JSONArray.fromObject(jsonStr);
                if (arry != null) {
                    rsList = new ArrayList<Map<String, Object>>();
                    for (int i = 0; i < arry.size(); i++) {
                        JSONObject jsonObject = arry.getJSONObject(i);
                        Map<String, Object> map = new HashMap<String, Object>();
                        for (Iterator<?> iter = jsonObject.keys(); iter.hasNext();) {
                            String key = (String) iter.next();
                            String value = jsonObject.get(key).toString();
                            map.put(key, value);
                        }
                        rsList.add(map);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rsList;
    }

}
