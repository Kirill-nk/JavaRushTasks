package com.javarush.task.pro.task18.task1822;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/* 
Из потока данных в список
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);

        getPositiveNumbers(numbers).forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        //напишите тут ваш код;
        return numbers.filter(x -> x > 0).collect(toList());
    }
}

//1822
/*Вы решили задачу лучше, чем 5% учеников.
Вам удалось ее решить с 3 попытки.
Среднее количество попыток для этой задачи 1.43.
Всего эту задачу решили 9424 учеников.*/