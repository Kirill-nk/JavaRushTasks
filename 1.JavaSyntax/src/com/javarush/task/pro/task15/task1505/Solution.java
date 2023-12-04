package com.javarush.task.pro.task15.task1505;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Что-то не копируется...
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int length = inputStream.read(buffer);
                outputStream.write(buffer, 0, length);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
//1505
//Вы решили задачу лучше, чем 26% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 2.12.
//Всего эту задачу решили 10642 учеников.