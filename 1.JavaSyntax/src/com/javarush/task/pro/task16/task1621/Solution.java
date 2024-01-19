package com.javarush.task.pro.task16.task1621;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/* 
Напиши шаблон
*/

public class Solution {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.parse(timeString, dateTimeFormatter);
        System.out.println(time);
    }
}
//1621
//Вы решили задачу лучше, чем 1% учеников.
//Вам удалось ее решить с 5 попытки.
//Среднее количество попыток для этой задачи 1.42.
//Всего эту задачу решили 9476 учеников.