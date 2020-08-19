package com.company.test_2.oop;

/*Задача 10
    Определить принадлежит ли точка с кординатами x,y окружности радиусом R с центром в точке x0,x0
 */

public class Task_10 {
    public void  point(int x, int y,int x1, int y1, int r){
        int sumOfSquares = (int) Math.sqrt (Math.pow(x - x1 ,2) + Math.pow(y - y1 ,2));
        if (sumOfSquares > r) System.out.println(" Точка лежит за пределами круга");
        if (sumOfSquares < r || sumOfSquares == r) System.out.println(" Точка пренадлежит кругу");
    }
}
