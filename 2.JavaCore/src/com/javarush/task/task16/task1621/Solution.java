package com.javarush.task.task16.task1621;

/* 
Thread.currentThread - всегда возвращает текущую нить
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) throws InterruptedException {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public void printMsg() throws InterruptedException {
            Thread t = null;//присвой переменной t текущую нить
            String name = t.currentThread().getName();
            System.out.println("Name=" + name);
            //add sleep here - добавь sleep тут
            Thread.sleep(1);
        }
    }
}
//1621. Thread.currentThread - всегда возвращает текущую нить
//Вы решили задачу лучше, чем 11% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.51.
//Всего эту задачу решили 36023 учеников.