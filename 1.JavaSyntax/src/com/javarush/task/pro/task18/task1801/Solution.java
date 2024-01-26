package com.javarush.task.pro.task18.task1801;

import java.util.ArrayList;

/* 
Две реализации одного интерфейса
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());
        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }


    public static void runList() {
        for (Runnable runnable : list) {
            runnable.run();
        }
    }
}

//1801
//Вы решили задачу лучше, чем 1% учеников.
//Вам удалось ее решить с 3 попытки.
//Среднее количество попыток для этой задачи 1.15.
//Всего эту задачу решили 10614 учеников.