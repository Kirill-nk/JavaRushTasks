package com.javarush.task.task16.task1605;

import java.util.Date;

/* 
Поговорим о музыке
*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {
        private String owner;

        @Override
        public void run() {
            Date start = startPlaying();
            Solution.sleepNSeconds(1);
            Date stop = stopPlaying();
            System.out.println("Playing " + (stop.getTime() - start.getTime()) + " ms");
        }

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }
    }
}

//1605.  Поговорим о музыке
//Вы решили задачу лучше, чем 42% учеников.
//Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.96.
// Всего эту задачу решили 39502 учеников.