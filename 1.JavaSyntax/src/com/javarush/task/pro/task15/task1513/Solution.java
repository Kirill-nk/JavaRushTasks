package com.javarush.task.pro.task15.task1513;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Зри в корень
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишите тут ваш код

        if(Path.of(str).isAbsolute()){
            System.out.println(str);
        } else {
            System.out.println(Path.of(str).toAbsolutePath());
        }
    }
}

//1513
//Вы решили задачу лучше, чем 23% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.36.
// Всего эту задачу решили 10126 учеников.