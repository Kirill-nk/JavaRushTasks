package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Path.of(str1);
        Path path2 = Path.of(str2);

        try {
            System.out.println(path1.relativize(path2));
        } catch (IllegalArgumentException e) {

        }
    }
}

//1514
//Вы решили задачу лучше, чем 3% учеников.
//Вам удалось ее решить с 10 попытки.
//Среднее количество попыток для этой задачи 3.39.
//Всего эту задачу решили 10376 учеников.

//Все относительно
//Напиши программу, которая будет считывать с клавиатуры два пути
// и выводить в консоль относительный путь между первым и вторым путями,
// если он существует. В противном случае выводить ничего не нужно.