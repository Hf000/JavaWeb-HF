package com.hufei.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:hufei
 * @CreateTime:2020-07-09
 * @Description:list集合工具类
 */
public class ListUtils {

    /**
     * 将Object对象转换成存储对应类型的List
     * @param obj
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> castList(Object obj, Class<T> clazz) {
        try {
            if (obj != null) {
                List<T> result = new ArrayList<T>();
                if(obj instanceof List<?>) {
                    for (Object o : (List<?>) obj) {
                        result.add(clazz.cast(o));
                    }
                    return result;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
