package com.javarush.task.pro.task15.task1506;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        List<String> strings = Files.readAllLines(Path.of(filename));

        for (String string : strings) {
            System.out.println(string.replaceAll("[., ]" , ""));

        }

    }
}
//1506
//Вы решили задачу лучше, чем 33% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 2.96.
//Всего эту задачу решили 9496 учеников.

