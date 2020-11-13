package com.hufei.technical.algorithm;

/**
 * @Author:hufei
 * @CreateTime:2020-11-09
 * @Description:选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {0, 12, 5, 8, 3, 2, 6};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int[] sort(int[] arr) {
        if (arr != null && arr.length > 0) {
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                idx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[idx]) {
                        idx = j;
                    }
                }
                if (i != idx) {
//                    arr[idx] = arr[idx]^arr[i];
//                    arr[i] =arr[idx]^arr[i];
//                    arr[idx] = arr[idx]^arr[i];
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                }
            }
        }
        return arr;
    }
}
