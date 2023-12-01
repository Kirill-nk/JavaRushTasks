package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        List<String> strings = Files.readAllLines(Path.of(filename));
        for (int i = 0; i < strings.size(); i = i + 2) {
            System.out.println(strings.get(i));
        }
    }
}

//1507
//Вы решили задачу лучше, чем 21% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 2.13.
//Всего эту задачу решили 9857 учеников.

