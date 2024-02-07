package com.javarush.task.pro.task18.task1823;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toSet;

/* 
Из потока данных во множество
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        //напишите тут ваш код
        Set<String> result = stringStream.filter(item -> item.length() > 6).collect(toSet());
        return new HashSet<>(result);
    }
}

//1823
/*Вы решили задачу лучше, чем 3% учеников.
Вам удалось ее решить с 2 попытки.
Среднее количество попыток для этой задачи 1.16.
Всего эту задачу решили 9360 учеников.*/