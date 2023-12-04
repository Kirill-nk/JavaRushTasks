package com.javarush.task.pro.task15.task1510;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем байты в файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)) {
            Files.write(Path.of(scanner.nextLine()), bytes);

//            BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
//            bufferedWriter.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

//1510
//Вы решили задачу лучше, чем 17% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.88.
//Всего эту задачу решили 9560 учеников.

//Пишем байты в файл
//У Амиго появилась задача: записать байты в файл