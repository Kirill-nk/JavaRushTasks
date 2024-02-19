package com.javarush.task.pro.task18.task1824;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/* 
Из потока данных — в map
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        //напишите тут ваш код
        return stringStream.collect(Collectors.toMap(x -> x, String::length));
    }
}
//1824
//Вы решили задачу лучше, чем 8% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.16.
//Всего эту задачу решили 9199 учеников.