package com.company.test_2.oop;

        /*Наибольший общий делитель (НОД) двух данных чисел «a» и «b» — это наибольшее число,
         на которое оба числа «a» и «b» делятся без остатка.28 64
*/

import java.util.Arrays;

public class Task_2 {
    private int[] arr;
    private int x;
    private int y;
    private int max;

    public Task_2() {
        this.arr = new int[0];
        this.x = x;
        this.y = y;
        this.max = max;
    }

    public int size() {
        return arr.length;
    }

    public int big(int x, int y) {
        int big = 0;
        if (x > y) big = x;
        else big = y;
        return big;
    }

    public void NOD(int x, int y) {
        int z = 1;
        for (int i = z; i < big(x, y); i++, z++) {
            if ((x % z == 0) & (y % z == 0)) {
                arrayZ(z);
                sortArr(arr);
            }
        }
        System.out.println(max);
    }

    public void arrayZ(int z) {
        int[] newArr = new int[size() + 1];
        for (int i = 0; i < size(); i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = z;
        arr = newArr;
    }

    public int sortArr(int[] arr) {
        max = arr[0];
        for (int i = 0; i < size(); i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
