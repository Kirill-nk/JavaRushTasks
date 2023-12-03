package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код

        LocalDate today = LocalDate.now();
        return today;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        LocalDate date = LocalDate.of(2020, 9, 12);
        return date;
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        LocalDate date = LocalDate.ofYearDay(2020, 256);
        return date;
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        LocalDate date = LocalDate.ofEpochDay(18517);
        return date;
    }
}
//1607
//Вы решили задачу лучше, чем 10% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.53.
//Всего эту задачу решили 10322 учеников.