package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable,Sellable, Discountable {
        @Override
        public boolean isMovable() {
            return false;
        }

        public Clothes() {
        }

        @Override
        public Object getAllowedAction() {
            return null;
        }

        @Override
        public Object getAllowedAction(String name) {
            return null;
        }
    }
}

//1501
//Вы решили задачу лучше, чем 15% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.4. В
// сего эту задачу решили 42111 учеников.