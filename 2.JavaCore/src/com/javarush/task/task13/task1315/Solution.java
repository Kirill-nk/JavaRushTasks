package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Cat implements Movable, Edible, Eat {

    }
    public interface Movable {
        void move();
    }

    public abstract class Dog implements Movable, Eat {

    }
    public interface Edible {
        void beEaten();
    }

    public abstract class Mouse implements Movable, Edible {

    }
    public interface Eat {
        void eat();
    }
}
/*
1315
Вы решили задачу лучше, чем 7% учеников.
Вам удалось ее решить с 2 попытки.
Среднее количество попыток для этой задачи 1.33.
Всего эту задачу решили 46774 учеников.
*/