package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();

        outputStream.reset();
        StringBuilder stringBuilder = new StringBuilder(result);
        String str = stringBuilder.reverse().toString();
        System.out.printf(str);
        printSomething(str);


    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
//1512
//Вы решили задачу лучше, чем 3% учеников.
// Вам удалось ее решить с 7 попытки.
// Среднее количество попыток для этой задачи 2.34.
// Всего эту задачу решили 9572 учеников.