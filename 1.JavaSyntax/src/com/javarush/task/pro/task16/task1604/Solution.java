package com.javarush.task.pro.task16.task1604;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1983, 4, 6);;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        String result = "";
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                return  "воскресенье";
            case 2:
                return  "понедельник";
            case 3:
                return  "вторник";
            case 4:
                return  "среда";
            case 5:
                return  "четверг";
            case 6:
                return  "пятница";
            case 7:
                return "суббота";
        }
        return result;

    }
}

//1604
//Вы решили задачу лучше, чем 4% учеников. Вам удалось ее решить с 6 попытки.
// Среднее количество попыток для этой задачи 2.2.
// Всего эту задачу решили 10374 учеников.

//День недели рождения твоего
//Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
//Реализуй метод getDayOfWeek(Calendar calendar), чтобы он