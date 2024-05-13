package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }
//    private boolean isCancel;

    public static void ourInterruptMethod() {
        TestThread.isCancel = true;
    }

    public static class TestThread implements Runnable {
        private static boolean isCancel = false;


        public void run() {
            try {
                while (!isCancel) {
                    Thread.sleep(500);
                    System.out.println("he-he");
                }
            } catch (InterruptedException e) {

            }
        }
    }
}
//1619. А без interrupt слабо?
//Вы решили задачу лучше, чем 26% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 1.66. Всего эту задачу решили 36934 учеников.