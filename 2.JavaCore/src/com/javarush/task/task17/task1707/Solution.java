package com.javarush.task.task17.task1707;

/* 
МВФ
*/

public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund);
    }
}

//1707. МВФ
//Вы решили задачу лучше, чем 8% учеников.
// Вам удалось ее решить с 4 попытки.
// Среднее количество попыток для этой задачи 2.1.
// Всего эту задачу решили 34025 учеников.