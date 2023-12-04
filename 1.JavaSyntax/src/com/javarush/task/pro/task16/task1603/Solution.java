package com.javarush.task.pro.task16.task1603;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Чиним формат
*/

public class Solution {

    public static void main(String[] args) {
        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }
}

//1603
//Вы решили задачу лучше, чем 8% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.4.
//Всего эту задачу решили 10621 учеников.