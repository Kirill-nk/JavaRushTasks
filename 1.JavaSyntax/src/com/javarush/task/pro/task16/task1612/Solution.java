package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        Set<LocalDateTime> set = new HashSet<>();
        for (Map.Entry<LocalDate, List<LocalTime>> payer : sourceMap.entrySet()) {
            for (LocalTime localTime : payer.getValue()) {
                LocalDateTime localDateTime = LocalDateTime.of(payer.getKey(), localTime);
                set.add(localDateTime);
            }

        }
        return set;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}

//1612 в 3
//Вы решили задачу лучше, чем 0% учеников.
//Вам удалось ее решить с 16 попытки.
//Среднее количество попыток для этой задачи 1.28.
//Всего эту задачу решили 9036 учеников.