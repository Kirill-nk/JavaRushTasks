package com.javarush.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем секунды
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private volatile boolean running = true;
        private int seconds;

        public void run() {
            try {
                //напишите тут ваш код
                while (running){
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
//1616. Считаем секунды.
//Вы решили задачу лучше, чем 29% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 1.62. Всего эту задачу решили 37793 учеников.