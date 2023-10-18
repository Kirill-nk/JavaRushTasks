package com.javarush.task.task12.task1232;

/* 
Нужно добавить в программу новую функциональность
*/

public class Solution {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly{

        @Override
        public void fly() {

        }
    }
}
//1232
//Вы решили задачу лучше, чем 7% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.12.
//Всего эту задачу решили 46088 учеников.