package com.javarush.task.pro.task16.task1602;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Подчищаем хвосты
*/

public class Solution {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        //напишите тут ваш код
        Date currentDay = new Date();
        for (Date date : brokenDates) {
            int year = date.getYear();
            int month = date.getMonth();

            if (date.after(currentDay)) {
                date.setYear(year - 1900);
                date.setMonth(month - 1);
            }
        }
    }
}

//1602
//Вы решили задачу лучше, чем 31% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.7.
//Всего эту задачу решили 10171 учеников.
//Подчищаем хвосты
//Метод fixDate принимает в качестве параметра список дат.