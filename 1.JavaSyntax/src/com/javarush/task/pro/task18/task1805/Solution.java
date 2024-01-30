package com.javarush.task.pro.task18.task1805;

import java.util.ArrayList;
import java.util.Collections;

/* 
Прощание с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        StringComparator comparator = new StringComparator();
        strings.sort(comparator);


    }
}
//1805
//Вы решили задачу лучше, чем 19% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 2.02.
//Всего эту задачу решили 10110 учеников.