package com.javarush.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;

/* 
Распаковка исключений
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
            //напишите тут ваш код
        } catch (RuntimeException e) {
            Throwable cause = e.getCause();
            if (cause instanceof FileNotFoundException) {
                System.out.println(FAILED_TO_READ);
            } else if (cause instanceof FileSystemException) {
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}

//1411
//Вы решили задачу лучше, чем 10% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.49.
//Всего эту задачу решили 12361 учеников.
//Распаковка исключений
//В методе main перехвати RuntimeException