package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        A = A/0;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

//1517. Статики и исключения
//Вы решили задачу лучше, чем 15% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.75.
//Всего эту задачу решили 39748 учеников.