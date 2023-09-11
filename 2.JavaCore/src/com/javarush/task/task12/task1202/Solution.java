package com.javarush.task.task12.task1202;

/* 
Кит, коровий потомок
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            return super.getName();
        }
    }
}
//1202
//Вы решили задачу лучше, чем 27% учеников. Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.44. Всего эту задачу решили 49265 учеников.