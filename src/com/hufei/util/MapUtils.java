package com.hufei.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.Map;

/**
 * @Author:hufei
 * @CreateTime:2020-07-09
 * @Description:map集合工具类
 */
public class MapUtils {

    /**
     * 根据key移除map集合中的元素,
     * @param map       需要移除元素的map集合
     * @param key       需要移除元素的key
     * @param type      类型 1=key; 2=values(后面补充)
     * @return
     */
    public static Map<String, Object> removeMapElement(Map<String, Object> map, String key, int type) {
        try {
            if (map != null && StringUtils.isNoneEmpty(key)) {
                Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
                if (iterator != null) {
                    while (iterator.hasNext()) {
                        Map.Entry<String, Object> entry = iterator.next();
                        if (type == 1 && key.equalsIgnoreCase(entry.getKey())) {
                            iterator.remove();
                        } else if (type == 2) {

                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

}
