package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

//      System.out.println("Введите путь");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String src = reader.readLine();


        try (FileInputStream bufferedReader = new FileInputStream(src)) {
            int i;
            while ((i = bufferedReader.read()) != -1) {
                System.out.print((char) i);
            }
        }reader.close();
    }
}
//1318
//Вы решили задачу лучше, чем 10% учеников.
//Вам удалось ее решить с 8 попытки.
//Среднее количество попыток для этой задачи 4.15.
//Всего эту задачу решили 43667 учеников.