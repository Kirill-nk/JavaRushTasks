package com.javarush.task.pro.task18.task1806;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

/* 
Знакомство с foreach
*/

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach((s) -> System.out.println(s));
    }
}
//1806
//Вы решили задачу лучше, чем 2% учеников.
//Вам удалось ее решить с 4 попытки.
//Среднее количество попыток для этой задачи 1.46.
//Всего эту задачу решили 10352 учеников.