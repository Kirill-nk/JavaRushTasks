package com.javarush.task.task16.task1625;

/* 
Взаимная блокировка
*/

public class Solution {
    static Thread t1 = new T1();
    static Thread t2 = new T2();

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t2.start();
        t1.interrupt();
        t2.interrupt();
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                t2.join();
                System.out.println("T1 finished");
            } catch (InterruptedException e) {
                System.out.println("T1 was interrupted");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                t1.join();
                System.out.println("T2 finished");
            } catch (InterruptedException e) {
                System.out.println("T2 was interrupted");
            }
        }
    }
}

//1625. Взаимная блокировка.
//Вы решили задачу лучше, чем 9% учеников. Вам удалось ее решить с 2 попытки. Среднее количество попыток для этой задачи 1.4. Всего эту задачу решили 34821 учеников.