package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        private StringBuilder builder = new StringBuilder();
        private List<String> result = new ArrayList<>();

        public void run() {
            try {
                for (int i = 0; i < 3; i++) {
                    String str = reader.readLine();
                    builder.append(str).append(" ");
                    result.add(str);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void printResult() {
            System.out.println(builder.toString().trim());
            //String collectedResult = String.join(" ", result);
            //System.out.println(collectedResult);
        }
    }
}

//1629. Только по-очереди!
//Вы решили задачу лучше, чем 33% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 1.79. Всего эту задачу решили 32930 учеников.