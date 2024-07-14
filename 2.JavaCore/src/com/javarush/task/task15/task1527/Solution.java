package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        int index = url.indexOf("?");
        String view = url.substring(index + 1);
        String[] words = view.split("&");

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("=")) {
                int idx = words[i].indexOf("=");
                String str = words[i].substring(0, idx);
                System.out.print(str + " ");
            } else {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
        for (String word : words) {
            if (word.contains("obj")) {
                String string = word.substring(word.indexOf("=") + 1);
                try {
                    alert(Double.parseDouble(string));
                } catch (NumberFormatException e) {
                    alert(string);
                }
            }
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

//Вы решили задачу лучше, чем 37% учеников. Вам удалось ее решить с 2 попытки. Среднее количество попыток для этой задачи 3.17. Всего эту задачу решили 31091 учеников.
