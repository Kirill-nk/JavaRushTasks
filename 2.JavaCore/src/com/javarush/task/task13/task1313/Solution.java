package com.javarush.task.task13.task1313;

import java.awt.*;

/* 
Лисица — это такое животное
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {


        public String getName() {
            return "Fox";
        }

    }
}
//1313
//Вы решили задачу лучше, чем 36% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.75.
// Всего эту задачу решили 46440 учеников.