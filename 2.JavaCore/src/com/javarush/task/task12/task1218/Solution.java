package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public abstract class Dog implements CanMove, CanEat {

    }

    public abstract class Duck implements CanMove, CanFly, CanEat {
    }

    public abstract class Car implements CanMove {
    }

    public abstract class Airplane implements CanMove, CanFly {
    }
}

//1218
//Вы решили задачу лучше, чем 26% учеников.
// Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 2.36.
// Всего эту задачу решили 48069 учеников.