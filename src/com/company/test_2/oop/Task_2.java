package com.company.test_2.oop;

        /*Наибольший общий делитель (НОД) двух данных чисел «a» и «b» — это наибольшее число,
         на которое оба числа «a» и «b» делятся без остатка.28 64
*/

import java.util.Arrays;

public class Task_2 {

    public int big(int x, int y) {
        int big = 0;
        return  x > y ? x : y;
    }

    public void NOD(int x, int y) {
        int z = 1;
        int max = 0;
        for (int i = z; i < big(x, y); i++, z++) {
            if ((x % z == 0) & (y % z == 0)) {
                max =z;
            }
        }
        System.out.println(max);
    }
}
