package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            while (numSeconds >= 1) {
                try {
                    System.out.print(numSeconds + " ");
                    Thread.sleep(1000);
                    numSeconds--;
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;
                }
            }
            System.out.println("Марш!");
        }
    }
}

//1617. Отсчет на гонках.
//Вы решили задачу лучше, чем 54% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 2.63.
//Всего эту задачу решили 36275 учеников.