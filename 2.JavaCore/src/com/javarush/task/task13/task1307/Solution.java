package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>//допишите здесь ваш код
    {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
//  1307
//Вы решили задачу лучше, чем 3% учеников.
//Вам удалось ее решить с 8 попытки.
//Среднее количество попыток для этой задачи 2.22.
//Всего эту задачу решили 46109 учеников.