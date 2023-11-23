package com.javarush.task.task15.task1505;

/* 
ООП - исправь ошибки в наследовании
*/

public class Solution {
    public interface HasWeight {
        int getWeight();

    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasHeight, HasWeight {
        @Override
        public int getHeight() {
            return 190;
        }

        @Override
        public int getWeight() {
            return 85;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
    }
}

//1505
//Вы решили задачу лучше, чем 9% учеников.
// Вам удалось ее решить с 3 попытки.
// Среднее количество попыток для этой задачи 1.89.
// Всего эту задачу решили 38649 учеников.