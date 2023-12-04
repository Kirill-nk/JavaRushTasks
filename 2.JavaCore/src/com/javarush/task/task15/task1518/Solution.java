package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    public static class Cat {
        public String name;
    }

    static {
        cat = new Cat();
        cat.name = "Васян";
        System.out.println(cat.name);
    }


    public static void main(String[] args) {

    }
}
//1518 - Статики и котики
//Вы решили задачу лучше, чем 0% учеников.
//Вам удалось ее решить с 22 попытки.
//Среднее количество попыток для этой задачи 2.59.
//Всего эту задачу решили 39192 учеников.