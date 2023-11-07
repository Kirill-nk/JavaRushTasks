package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new SimpleObject<String>() {
            @Override
            public SimpleObject<String> getInstance() {
                return null;
            }
        };
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject<String> {

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }

}
//1322
//Вы решили задачу лучше, чем 10% учеников.
// Вам удалось ее решить с 3 попытки.
// Среднее количество попыток для этой задачи 1.81.
// Всего эту задачу решили 42885 учеников.