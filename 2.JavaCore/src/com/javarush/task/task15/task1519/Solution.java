package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = reader.readLine()).equals("exit")) {
            try {
                if (input.contains(".")) {
                    print(Double.parseDouble(input));
                } else if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 128) {
                    print(Short.parseShort(input));
                } else if (Integer.parseInt(input) <= 0 || Integer.parseInt(input) >= 128) {
                    print(Integer.parseInt(input));
                }

            } catch (Exception e) {
                print(input);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

//1519. Разные методы для разных типов
//Вы решили задачу лучше, чем 6% учеников. Вам удалось ее решить с 8 попытки. Среднее количество попыток для этой задачи 3.18. Всего эту задачу решили 37298 учеников.