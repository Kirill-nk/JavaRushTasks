package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файловые операции
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        //напишите тут ваш код
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        } else if (Files.exists(filePath) && Files.notExists(fileNewPath)){
            Files.move(filePath, fileNewPath);
        } else {
            Files.delete(filePath);
        }
    }
}

//1517
//Вы решили задачу лучше, чем 35% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.8.
// Всего эту задачу решили 10689 учеников.