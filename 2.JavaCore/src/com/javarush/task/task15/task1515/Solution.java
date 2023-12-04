package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

//            String string = reader.readLine();
//            int number = Integer.parseInt(string);
//            A = number;
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static final int MIN = min(A, B);
    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
//1515
//Статики-2
//В этой задаче тебе нужно:
//В статическом блоке считать с консоли А и В — две переменные с типом int.
//Вы решили задачу лучше, чем 13% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.69.
//Всего эту задачу решили 40006 учеников.