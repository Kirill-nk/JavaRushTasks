package com.javarush.task.task15.task1510;

/* 
Все лишнее - прочь!
*/

public class Solution {
    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
//        add("1", 2d);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}

//1510
//Вы решили задачу лучше, чем 1% учеников.
// Вам удалось ее решить с 7 попытки.
// Среднее количество попыток для этой задачи 1.5.
// Всего эту задачу решили 40819 учеников.