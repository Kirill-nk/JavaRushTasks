package com.javarush.task.task12.task1227;

/* 
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public abstract class Duck implements CanFly, CanRun, CanSwim {

    }

    public abstract class Penguin implements CanRun, CanSwim {

    }

    public abstract class Toad implements CanSwim {

    }
}

//1227
//Вы решили задачу лучше, чем 25% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.4.
// Всего эту задачу решили 46243 учеников.