package com.company.test_2.oop;

        /*Задача 1
        По введенным пользователем координатам двух точек вывести уравнение прямой, проходящей через эти точки.
        Примечание:
        уравнение прямой имеет вид y=kx+b, соответственно необходимо найти значения k и b, для этого надо решить систему
        y1 = k*x1+b
        y2 = k*x2+b  b = y2 – kx2
        где x1,y1 - координаты первой точки, x2,y2 - второй
        Например для точек точка1(1,7) и точка2(-1,3) программа должна вывести что-то в стиле "y=2x+5" для точек
        Тех.работа :
        k = (y1 - y2) / (x1 - x2)
        b = y2 - ((y1 - y2) / (x1 - x2)) * x2
        y = x * (y1 - y2) / (x1 - x2) + (y2 - ((y1 - y2) / (x1 - x2)) * x2)
        */

public class Task_1 {

    public void straightLineEquation(int x1, int y1, int x2, int y2) {
        int k = (y1 - y2) / (x1 - x2);
        int b = y2 - (((y1 - y2) / (x1 - x2)) * x2);
        System.out.println(" Y = " + k + "X + " + b);
    }
}