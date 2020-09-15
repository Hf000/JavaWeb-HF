package com.hufei.technical.stream_example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author:hufei
 * @CreateTime:2020-08-03
 * @Description:stream流测试
 */
public class StreamTest {

    public static void main(String[] args) throws Exception {
//        distinctTest();

//        reduceTest();

        ofTest();

    }

    private static void ofTest() {
//        Stream<String> stringStream = Stream.of("张三", "李四", "王五");
//        Stream<Object> stream = Stream.of("1", "2", 3,true,new Object());//实际上就是将传入的参数转换成了数组
//        stringStream.forEach(s -> System.out.println(s));
//        stream.forEach(s-> System.out.println(s));
        Object[] arr = {"1","2",3,true,new Object()};
//        for (Object o : arr) {
//            System.out.println(o);
//        }
//        Arrays.stream(arr).forEach(s-> System.out.println(s));
        Arrays.asList(arr).forEach(s-> System.out.println(s));
    }

    private static void reduceTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2);
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        Integer reduce2 = list.stream().reduce(0, Integer::sum);
        Optional<Integer> reduce3 = list.stream().reduce(Integer::sum);
        Optional<Integer> reduce4 = list.stream().reduce((a, b) -> a + b);
        System.out.println(reduce);
        System.out.println(reduce2);
        if (reduce3.isPresent()) {
            System.out.println(reduce3.get());
        } else {
            System.out.println("没有结果");
        }
        if (reduce4.isPresent()) {
            System.out.println(reduce4.get());
        }
    }

    private static void distinctTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2);
        list.forEach(e-> System.out.println(e));
        System.out.println("============================================================================");
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        collect.forEach(e-> System.out.println(e));
    }

}
