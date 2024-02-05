package com.javarush.task.pro.task18.task1811;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Получение потока Stream
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Зима", "Весна", "Лето", "Осень");

        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
        return list.stream();
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
        return Arrays.stream(array);
    }
}
//1811
//Вы решили задачу лучше, чем 3% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.18.
//Всего эту задачу решили 10068 учеников.