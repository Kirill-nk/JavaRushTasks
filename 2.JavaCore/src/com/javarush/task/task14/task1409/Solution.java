package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}

//1409
//Вы решили задачу лучше, чем 10% учеников.
// Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 1.57.
// Всего эту задачу решили 41737 учеников.