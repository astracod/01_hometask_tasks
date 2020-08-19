package com.company.test_2.oop;

/*Найти наименьшее общее кратное двух чисел*/

import java.util.Arrays;

public class Task_3 {
    private int[] arr;
    private int[] arr2;
    private int[] arr3;
    private int min;
    private int lcm;


    public Task_3() {
        this.arr = new int[0];
        this.arr2 = new int[0];
        this.arr3 = new int[0];
        this.min = min;
        this.lcm = lcm;
    }

    public void createArr(int x, int y) {
        for (int i = 1; i <= x; i++) {
            int z = x * i;
            arr = bigArray(arr, z);
        }
        for (int i = 1; i <= y; i++) {
            int z = y * i;
            arr2 = bigArray(arr2, z);
        }
    }

    public int[] bigArray(int[] arr, int z) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = z;
        arr = newArr;
        return arr;
    }

    public int sortMin(int[] arr) {
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i] & min != 0) {
                min = arr[i];
            }
        }
        return min;
    }

    public int LeastCommonMultiple() {
        int[] n = new int[0];
        for (int i = 0; i < arr2.length; i++) {
            int a = arr2[i];
            for (int j = 0; j < arr.length; j++) {
                if (a == arr[j]) {
                    arr3 = bigArray(arr3, a);
                }
            }
        }
        int c = sortMin(arr3);
        return c;
    }
}






