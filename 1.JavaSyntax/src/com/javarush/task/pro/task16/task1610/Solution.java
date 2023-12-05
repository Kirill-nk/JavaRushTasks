package com.javarush.task.pro.task16.task1610;

import java.time.LocalTime;

/* 
Тренировка на время
*/

public class Solution {

    static LocalTime timeMax;
    static LocalTime timeMin;
    static LocalTime time1;
    static LocalTime time2;
    static LocalTime time3;
    static LocalTime time4;

    public static void main(String[] args) {
        LocalTime timeMax = LocalTime.now();
        LocalTime timeMin = LocalTime.now();
        LocalTime time1 = LocalTime.of();
        LocalTime time2 = LocalTime.now();
        LocalTime time3 = LocalTime.now();
        LocalTime time4 = LocalTime.now();
        System.out.println(timeMax.getHour());
        System.out.println(timeMin.getMinute());
        System.out.println(time1.getSecond());
        System.out.println(time2.getNano());
        System.out.println(time3.getNano());
        System.out.println(time4.getNano());

    }
}
