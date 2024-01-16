package com.javarush.task.pro.task16.task1618;

import java.time.*;


/* 
Лишь бы не запутаться
*/

public class Solution {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        //напишите тут ваш код
        ZonedDateTime fromZon1 = fromDateTime.atZone(fromZone);
        ZonedDateTime toZone2 = fromZon1.withZoneSameInstant(toZone);

        return toZone2.toLocalDateTime();
    }
}
//1618
//Вы решили задачу лучше, чем 32% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.61.
//Всего эту задачу решили 9024 учеников.