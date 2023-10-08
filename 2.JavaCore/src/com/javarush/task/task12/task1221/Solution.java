package com.javarush.task.task12.task1221;

/* 
Все мы немного кошки…
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        public String getName() {
            return "Я - кот";
        }
    }
}
//1221
//Вы решили задачу лучше, чем 15% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.22.
// Всего эту задачу решили 47567 учеников.