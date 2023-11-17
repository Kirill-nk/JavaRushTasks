package com.javarush.task.pro.task15.task1516;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String str = scanner.nextLine();
            if (Files.isRegularFile(Path.of(str))) {
                System.out.println(str + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(str))) {
                System.out.println(str + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}

//1516
//Файл или директория

//Вы решили задачу лучше, чем 65% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 3.08.
//Всего эту задачу решили 10335 учеников.