package com.javarush.task.task15.task1521;

import java.math.BigDecimal;

/* 
ООП. Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        new Tree().info((Object) new Integer("4"));
        new Tree().info((Object) new Short("4"));
        new Tree().info((Object) new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
//1521. ООП. Перегрузка
//Вы решили задачу лучше, чем 2% учеников. Вам удалось ее решить с 3 попытки. Среднее количество попыток для этой задачи 1.26. Всего эту задачу решили 38234 учеников.