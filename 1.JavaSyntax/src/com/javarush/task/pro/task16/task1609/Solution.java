package com.javarush.task.pro.task16.task1609;

import java.time.LocalDate;

/* 
С годами моложе
*/

public class Solution {

    public static void main(String[] args) {
        LocalDate jubilee40Years = LocalDate.of(2010, 3, 13);

        LocalDate jubilee30Years = jubilee40Years.minusYears(10);

        System.out.println(Math.abs(jubilee30Years.getYear()));
    }
}
//1609
//Вы решили задачу лучше, чем 7% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.09.
//Всего эту задачу решили 10240 учеников.