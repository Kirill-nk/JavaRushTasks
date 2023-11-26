package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //напишите тут ваш код
//https://github.com/Kirill-nk/SQL-EX.git
        URL url = new URL(line);
        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        Path tempFile = Files.createTempFile(null, null);
        Files.write(tempFile, buffer);
    }
}
//1521
//Вы решили задачу лучше, чем 31% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.6.
//Всего эту задачу решили 9394 учеников.