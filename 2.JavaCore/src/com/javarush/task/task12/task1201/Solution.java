package com.javarush.task.task12.task1201;

/* 
Киты и коровы
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я не корова, Я - кит.";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            return super.getName();
        }
    }
}
//1201
//Вы решили задачу лучше, чем 10% учеников. Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 1.49. Всего эту задачу решили 49414 учеников.