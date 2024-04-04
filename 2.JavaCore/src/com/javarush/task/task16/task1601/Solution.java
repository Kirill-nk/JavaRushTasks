package com.javarush.task.task16.task1601;

/* 
My first thread
*/

public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}

//1601
//Вы решили задачу лучше, чем 16% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.29.
//Всего эту задачу решили 40677 учеников.