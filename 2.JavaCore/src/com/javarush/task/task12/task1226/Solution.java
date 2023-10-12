package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }
    public interface CanFly {
        public void fly();
    }
    public interface CanClimb  {
        public void climb();
    }

    public interface CanRun {
        public void run();
    }



    public abstract class Cat implements CanRun, CanClimb {
    }

    public abstract class Dog implements CanRun {
    }

    public abstract class Tiger extends Cat {
    }

    public abstract class Duck implements CanRun, CanFly {
    }
}
//1226
//Вы решили задачу лучше, чем 35% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.67.
// Всего эту задачу решили 46273 учеников.