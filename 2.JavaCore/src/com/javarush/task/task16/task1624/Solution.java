package com.javarush.task.task16.task1624;

/* 
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

public class Solution {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String[] a) throws Exception {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }
}

//1624. Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
//Вы решили задачу лучше, чем 1% учеников. Вам удалось ее решить с 3 попытки. Среднее количество попыток для этой задачи 1.11. Всего эту задачу решили 34689 учеников.