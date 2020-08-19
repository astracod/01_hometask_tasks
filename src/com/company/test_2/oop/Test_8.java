package com.company.test_2.oop;

    /* Написать программу определения количества 2*N -значных билетов,
       у которых сумма первых N десятичных цифр равна сумме N последних десятичных цифр;
       при этом N -произвольное натуральное число.

       если n=3, то  6-тизначное число (123456)
       если 2, то 4х значное (1324)   int number = 1234, int n = 4;
       если 1, то 2хзначное (12)
  */

public class Test_8 {

    public boolean isHappy(int number, int n) {
        int collection1 = 0;
        int collection2 = 0;
        boolean happy = false;
        for (int i = number, j = 0; i != 0; i /= 10, j++) {

            if (j >= (n / 2)) collection2 += i % 10;

            else collection1 += i % 10;
        }
        if (collection1 == collection2) happy = true;
        return happy;
    }

    public void digiCapacity(int period) {
        int n = 0;
        int end = (int) Math.pow(10, (period + period));

        System.out.println(" end : " + end);
        int start = end / 10;
        if (period == 1) start = 1;
        System.out.println(" start : " + start);

        String endS = Integer.toString(end);
        int count = endS.length() - 1;
        System.out.println(" Число N : " + count);
        for (int i = end; i >= start; i--) {
            if ((isHappy(i, count)) == true) {
                System.out.println(" Число с совпадающими суммами : " + i);
            }
        }
        System.out.println(" Артур, условия для проведения подсчета смотри вверху вывода консоли ^^^^ !!!");
    }
}
