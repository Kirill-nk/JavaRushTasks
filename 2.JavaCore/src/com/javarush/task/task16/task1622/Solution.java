package com.javarush.task.task16.task1622;

/* 
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

public class Solution {
    public static volatile int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //напишите тут ваш код
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Нить прервана");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
//1622. Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
//Вы решили задачу лучше, чем 41% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.94.
//Всего эту задачу решили 35143 учеников.