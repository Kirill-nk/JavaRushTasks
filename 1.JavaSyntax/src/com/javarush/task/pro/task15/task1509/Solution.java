package com.javarush.task.pro.task15.task1509;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/* 
Еще раз читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        InputStream stream = System.in;
        Scanner console = new Scanner(stream);
        String reader = console.nextLine();


        char[] chars = reader.toCharArray();
        Set<Character> characters = new HashSet<>();
        for (char aChar : chars) {
            if (Character.isAlphabetic(aChar)) {
                characters.add(Character.toLowerCase(aChar));
            }
        }
        System.out.println(characters);
    }
}
//1509
//Еще раз читаем из консоли
//Программа считывает из консоли строку и выводит список букв, из которых состоит введенная строка.
//Вы решили задачу лучше, чем 11% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.18.
//Всего эту задачу решили 10825 учеников.