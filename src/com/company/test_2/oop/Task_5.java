package com.company.test_2.oop;

    /*Имеется массив чисел, выбрать из него все уникальные значения
    Пример: если на входе на входе [1,2,5,7,6,9,7,6,5,1,3,9], то на выходе [1,2,5,7,6,9,3]
*/

import java.util.Arrays;

public class Task_5 {
    private int[] arr;

    public Task_5() {
        this.arr = new int[]{1, 2, 5, 7, 6, 9, 7, 6, 5, 1, 3, 9};
    }

    public int[] lookingForSimilarities() {
        System.out.println(Arrays.toString(arr));
        int[] buf = new int[arr.length];
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean e = false;
            for (int j = 0; j < element; j++) {
                if (arr[i] == buf[j]) {
                    e = true;
                }
            }
            if (e == false) {
                element++;
                buf[element - 1] = arr[i];
            }
        }
        int[] end = new int[element];
        for (int i = 0; i < end.length; i++) {
            end[i] = buf[i];
        }
        return end;
    }
}
