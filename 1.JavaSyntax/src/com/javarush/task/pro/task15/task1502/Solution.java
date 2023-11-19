package com.javarush.task.pro.task15.task1502;

import java.util.Scanner;

/*
Возврат к истокам
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

        finally{
             if (scanner != null)
             scanner.close();
        }
    }
}

//1502. Возврат к истокам.
//Программа считывает с консоли строку и выводит ее на экран в верхнем регистре
//Вы решили задачу лучше, чем 1% учеников.
//Вам удалось ее решить с 7 попытки.
//Среднее количество попыток для этой задачи 1.91.
//Всего эту задачу решили 13706 учеников.
