package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        Instant timestamp = Instant.ofEpochMilli(Long.MAX_VALUE);
        return timestamp;
    }

    static Instant getMaxFromSeconds() {
        Instant timestamp = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        return timestamp;
    }

    static Instant getMaxFromSecondsAndNanos() {
        Instant timestamp = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
        return timestamp;
    }
}
//1614
//Конец времен В классе Solution реализуй три метода:
//Вы решили задачу лучше, чем 13% учеников.
// Вам удалось ее решить с 3 попытки.
// Среднее количество попыток для этой задачи 2.09.
// Всего эту задачу решили 9497 учеников.