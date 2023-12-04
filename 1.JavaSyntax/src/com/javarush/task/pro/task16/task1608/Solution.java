package com.javarush.task.pro.task16.task1608;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/* 
Просто день недели
*/

public class Solution {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        Locale russ = new Locale("ru", "RU");
        return day.getDisplayName(TextStyle.FULL, russ);
    }
}

//1608;
//Вы решили задачу лучше, чем 13% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.25.
//Всего эту задачу решили 10147 учеников.