package com.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
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

//1515
//Абсолютный путь
//Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли,
// при этом если путь не абсолютный, то перед выводом его нужно преобразовать к таковому.
//Вы решили задачу лучше, чем 14% учеников.
// Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 1.61.
// Всего эту задачу решили 10464 учеников.