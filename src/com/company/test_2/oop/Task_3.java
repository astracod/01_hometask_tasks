package com.company.test_2.oop;

/*Найти наименьшее общее кратное двух чисел*/

import java.util.Arrays;

public class Task_3 {

    public void LeastCommonMultiple(int x, int y) {
        for (int i = 1; i <= x; i++) {
            int z1 = 0;
            int z2 = 0;
            z1 = x * i;
            int nok = 0;
            for (int j = 0; j <= y; j++) {
                z2 = y * j;
                if (z1 == z2) {
                    nok = z2;
                    System.out.println(nok);
                }
            }
            if (nok != 0) break;
        }
    }
}






