package com.javarush.task.task13.task1323;

/* 
Интерфейс Updatable в классе Screen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements  Updatable{
        @Override
        public void refresh() {

        }

        @Override
        public void onSelect() {

        }
    }
}

//1323
//Вы решили задачу лучше, чем 5% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.08.
//Всего эту задачу решили 43406 учеников.