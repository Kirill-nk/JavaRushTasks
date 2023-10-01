package com.javarush.task.task12.task1214;

/* 
Корова — тоже животное
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal{
        @Override
        public String getName() {
            return "Любовь";
        }
    }

}
//1214
//Вы решили задачу лучше, чем 36% учеников. Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.77. Всего эту задачу решили 48575 учеников.