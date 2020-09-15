package com.hufei.technical.algorithm;

/**
 * @Author:hufei
 * @CreateTime:2020-09-15
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis());
        Snowflake snow = new Snowflake(1,1);
        for (int i = 0; i < 100; i++) {
            System.out.println(snow.getId());
        }
    }

}
