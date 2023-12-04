package com.javarush.task.task15.task1509;

/* 
Мужчина или женщина?
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        printName(man);
        printName(woman);
    }

    public static void printName(Human man) {
    }

    public static class Human {

    }

    public static class Man extends Human{

    }

    public static class Woman extends Human{

    }
}
//1509
//Вы решили задачу лучше, чем 17% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.29.
//Всего эту задачу решили 40789 учеников.