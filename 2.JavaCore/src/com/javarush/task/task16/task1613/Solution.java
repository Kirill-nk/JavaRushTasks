package com.javarush.task.task16.task1613;

/* 
Big Ben clock
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            Thread.sleep(1000);
            if (seconds != 59) seconds++;
            else {
                seconds = 0;
                if (minutes != 59) minutes++;
                else {
                    minutes = 0;
                    if (hours != 23) hours++;
                    else hours = 0;
                }
            }

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("В г. %s сейчас %02d:%02d:%02d!", cityName, hours, minutes, seconds));
            }
        }
    }
}

//1613. Big Ben clock
//Вы решили задачу лучше, чем 7% учеников. Вам удалось ее решить с 4 попытки. Среднее количество попыток для этой задачи 1.94. Всего эту задачу решили 37963 учеников.