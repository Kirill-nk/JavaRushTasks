package com.javarush.task.task16.task1604;

/* 
Вывод стек-трейса
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();
    }

    public static class SpecialThread implements Runnable {
        static {
            System.out.println("*****************");
        }

        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace())
                System.out.println(element);
        }
    }
}

//1604. Вывод стек-трейса
//Вы решили задачу лучше, чем 13% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.6.
//Всего эту задачу решили 39848 учеников.
