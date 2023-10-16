package com.javarush.task.task12.task1230;

/* 
Попадание в десятку
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(Integer i) {
        return i * 2;
    }

    public static int transformValue(int i) {
        return i * i;
    }
}

//1230
//Вы решили задачу лучше, чем 40% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.83.
//Всего эту задачу решили 45925 учеников.