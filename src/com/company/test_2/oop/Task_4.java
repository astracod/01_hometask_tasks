package com.company.test_2.oop;

//      Разложить число на простые сомножители

import java.util.Arrays;

public class Task_4 {

    private int[] dividers;

    public Task_4() {
        this.dividers = new int[0];
    }

    public int size() {
        return dividers.length;
    }

    public int get(int index) {
        return this.dividers[index];
    }

    public int[] searchDivisors(int number) {
       int divider = 1;
        for (int i = divider; i <= number; i++) {
            if (number % i == 0 & i > 1) {
                number = number / i;
                if (divider != i ) divider = i;
                dividers = addDivider(divider);
//                System.out.println(divider);
            }
        }
        return dividers;
    }

    public int[] addDivider(int divider) {
        int[] newArr = new int[size() + 1];
        for (int i = 0; i < size(); i++) {
            newArr[i] = get(i);
        }

        newArr[size()] = divider;
        return dividers = newArr;
    }
}
