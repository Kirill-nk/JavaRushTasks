package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
//      System.out.println("Введите путь к файлу:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        List<Integer> list = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {

            while (reader.ready()) {
                String string = reader.readLine();
                int number = Integer.parseInt(string);
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

//1326
//Вы решили задачу лучше, чем 12% учеников.
//Вам удалось ее решить с 6 попытки.
//Среднее количество попыток для этой задачи 3.48.
//Всего эту задачу решили 38636 учеников.