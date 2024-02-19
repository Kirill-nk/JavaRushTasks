package com.javarush.task.pro.task18.task1816;

import java.util.stream.Stream;

/* 
Преобразование данных-2
*/

public class Solution {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        //напишите тут ваш код
        return strings.map(x -> x.toUpperCase());
    }
}
//1816
//Вы решили задачу лучше, чем 8% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.14.
//Всего эту задачу решили 9605 учеников.