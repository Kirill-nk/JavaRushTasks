package com.javarush.task.pro.task15.task1511;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем символы в файл
*/

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream);
             BufferedWriter writer = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
             writer.write(chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

//1511
//Вы решили задачу лучше, чем 2% учеников.
//Вам удалось ее решить с 6 попытки.
//Среднее количество попыток для этой задачи 1.82.
//Всего эту задачу решили 10335 учеников.