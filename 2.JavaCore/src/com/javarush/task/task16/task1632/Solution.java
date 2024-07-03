package com.javarush.task.task16.task1632;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                int sum = 0;
                while (true) {
                    String text = reader.readLine();
                    if (text.equals("N")) {
                        break;
                    }
                    int i = Integer.parseInt(text);
                    sum = sum + i;
                }
                System.out.println(sum);
            } catch (IOException e) {

            }
        }
    }

    public static void main(String[] args) {
    }
}

//1632. Клубок
//Вы решили задачу лучше, чем 82% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 6.11.
//Всего эту задачу решили 30328 учеников.