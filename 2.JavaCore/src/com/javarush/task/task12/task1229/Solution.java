package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends chief implements Businessman {

    }

    public static class chief {
        public void workHard() {

        }
    }
}

//1229
//Вы решили задачу лучше, чем 15% учеников.
// Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 1.76.
// Всего эту задачу решили 46018 учеников.