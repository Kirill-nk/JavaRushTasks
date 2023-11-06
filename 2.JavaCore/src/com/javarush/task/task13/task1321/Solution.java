package com.javarush.task.task13.task1321;


/* 
Исправление ошибок
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
//1321
/*Вы решили задачу лучше, чем 15% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 1.27. Всего эту задачу решили 43571 учеников. */
