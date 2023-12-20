package com.javarush.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Оборачивание исключений
*/

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (FileSystemException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
//1410
//Вы решили задачу лучше, чем 3% учеников.
//Вам удалось ее решить с 4 попытки.
//Среднее количество попыток для этой задачи 1.53.
//Всего эту задачу решили 12653 учеников.