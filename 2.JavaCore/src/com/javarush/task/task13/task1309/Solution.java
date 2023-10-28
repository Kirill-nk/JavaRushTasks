package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canfly);
    }

}

//Вы решили задачу лучше, чем 4% учеников.
//Вам удалось ее решить с 5 попытки.
//Среднее количество попыток для этой задачи 2.04.
//Всего эту задачу решили 46092 учеников.