package com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простой шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. ");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("Hч.mмин");
        String text = dtf.format(localDateTime);
        String text1 = dtf1.format(localDateTime);
        System.out.println(text + text1);

    }
}
//1619
//Вы решили задачу лучше, чем 39% учеников.
// Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 2.67.
// Всего эту задачу решили 9756 учеников.