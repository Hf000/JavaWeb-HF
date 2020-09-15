package com.hufei.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:hufei
 * @CreateTime:2020-07-29
 * @Description:lambda表达式测试
 */
public class LambadTest {

    public static void main(String[] args) {
        String[] arr = {"java", "c", "c++", "python", "php", ".net", "kolitn"};
        for (String s: arr) {
            System.out.println(s);
        }

        List<String> list = new ArrayList<String>();
        list = Arrays.asList(arr);
        list.forEach(s -> {
            System.out.println(s);
        });
    }

}
