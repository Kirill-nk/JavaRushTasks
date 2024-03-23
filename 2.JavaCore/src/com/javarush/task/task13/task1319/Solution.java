package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//      System.out.println("Введите путь: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            while (true) {
                String text = scanner.nextLine();
                writer.write(text);
                writer.newLine();
                if (text.equals("exit")) {
                    break;
                }
            }
        }
    }
}

//1319
//Вы решили задачу лучше, чем 21% учеников.
//Вам удалось ее решить с 4 попытки.
//Среднее количество попыток для этой задачи 3.39.
//Всего эту задачу решили 42202 учеников.