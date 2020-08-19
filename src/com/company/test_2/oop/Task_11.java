package com.company.test_2.oop;

/*
* Задача 11
Случайные числа в диапазоне от -5 до 5 разложить по двум массивам: в одни помещать только положительные, во второй - только отрицательные.
*  Числа, равные нулю, игнорировать. Вывести на экран все сгенерированные случайные числа и элементы обоих массивов.
* R(a...b) = (R(0...1)*(b-a))+a
* Да их должно быть два, количество чисел (общее ) пусть будет входным параметром,
*  я бы сначала все загнал в один массив и посчитал сколько элементов будет в новых 2х массивах а потом раскладывал*/

import java.util.Arrays;

public class Task_11 {
    int n;
    int[] arr;

    public int[] deleteZero(int[] arr, int z) {
        int[] newArr = new int[arr.length - z];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(newArr.length);
        arr = newArr;
        return arr;
    }


    public void randomZone(int n) {
        arr = new int[n];
        int plussize = 0;
        int minussize = 0;
        int min = -5;
        int max = 5;


        for (int i = 0; i < n; i++) {
            int a = (int) Math.round(Math.random() * ((max - min)) + min);
            arr[i] = a;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) plussize++;
            if (arr[j] < 0) minussize++;
        }
        int[] plus = new int[plussize];
        int[] minus = new int[minussize];

        for (int i = 0,j = 0, k = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            if (arr[i] > 0){
                    plus[j] = arr[i];
                    j++;
            }
            if (arr[i] < 0){
                minus[k] = arr[i];
                k++;
            }

        }
        System.out.println(" Массив с изначальными значениями : " + Arrays.toString(arr));
        System.out.println(" Массив с положительными значениями : " + Arrays.toString(plus));
        System.out.println(" массив с минусовыми значениями : " + Arrays.toString(minus));

    }

}
