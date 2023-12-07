package com.javarush.task.pro.task16.task1611;

import java.time.LocalTime;

/* 
Нужно просто посчитать
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {

        return base.plusMinutes(288);
    }
}
//1611
//Вы решили задачу лучше, чем 25% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.58.
//Всего эту задачу решили 10085 учеников.