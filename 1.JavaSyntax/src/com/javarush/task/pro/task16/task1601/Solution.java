package com.javarush.task.pro.task16.task1601;

import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(93, 4, 6);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        String result = "";
        int day = date.getDay();
        switch (day) {
            case 0:
                return  "воскресенье";
            case 1:
                return  "понедельник";
            case 2:
                return  "вторник";
            case 3:
                return  "среда";
            case 4:
                return  "четверг";
            case 5:
                return  "пятница";
            case 6:
                return "суббота";
        }
        return result;
    }
}

//1601
//Вы решили задачу лучше, чем 2% учеников.
//Вам удалось ее решить с 11 попытки.
//Среднее количество попыток для этой задачи 2.99.
//Всего эту задачу решили 10696 учеников.