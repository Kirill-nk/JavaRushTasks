package com.javarush.task.pro.task14.task1409;

/* 
Пропускаем сквозь себя
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}
//1409
//Вы решили задачу лучше, чем 10% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.16.
//Всего эту задачу решили 12994 учеников.