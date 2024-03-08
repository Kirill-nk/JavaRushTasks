package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код


        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : files) {
                if (Files.isRegularFile(path)) {
                    Files.copy(path, targetDirectory.resolve(path.getFileName()));
                    System.out.println(path);
                }
            }
        }
    }
}

//1519
//Вы решили задачу лучше, чем 17% учеников.
// Вам удалось ее решить с 4 попытки.
// Среднее количество попыток для этой задачи 3.0.
// Всего эту задачу решили 10452 учеников.