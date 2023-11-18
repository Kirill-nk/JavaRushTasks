package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Wine wine = new Wine();
        return wine;
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getSparklingWine() {
        SparklingWine sparklingWine = new SparklingWine();
        return sparklingWine;
    }
}
//1410.
//Не пройдено всего три пункта:
//В классе Solution должен быть реализован метод getDeliciousDrink(),
// который возвращает объект типа Wine.
//В классе Solution должен быть реализован метод getWine(), который возвращает объект типа Wine.
//В классе Solution должен быть реализован метод getSparklingWine(), который возвращает объект типа SparklingWine.


//Вы решили задачу лучше, чем 3% учеников. Вам удалось ее решить с 5 попытки. Среднее количество попыток для этой задачи 1.71. Всего эту задачу решили 41235 учеников.
