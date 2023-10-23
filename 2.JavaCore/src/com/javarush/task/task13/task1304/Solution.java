package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public abstract class Screen implements Selectable, Updatable {
        @Override
        public void refresh() {

        }

        @Override
        public void onSelect() {

        }
    }
}

//1304 //Selectable и Updatable. Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
// Не забудь реализовать методы!
//Вы решили задачу лучше, чем 6% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.1.
//Всего эту задачу решили 47064 учеников.