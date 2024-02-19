package com.javarush.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Как быть, если в списке есть элемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        //напишите тут ваш код
        list.stream().map(x -> Optional.ofNullable(x).orElse(text))
                .forEach(System.out::println);
    }
}
//1819
/*Вы решили задачу лучше, чем 9% учеников.
Вам удалось ее решить с 2 попытки.
Среднее количество попыток для этой задачи 1.57.
Всего эту задачу решили 9267 учеников*/