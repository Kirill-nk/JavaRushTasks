package com.javarush.task.pro.task18.task1807;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* 
Прощание с foreach
*/

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        //        strings.forEach(string -> System.out.println(string));
    }
}
//1807
//Вы решили задачу лучше, чем 3% учеников.
//Вам удалось ее решить с 3 попытки.
//Среднее количество попыток для этой задачи 1.58.
//Всего эту задачу решили 10283 учеников.