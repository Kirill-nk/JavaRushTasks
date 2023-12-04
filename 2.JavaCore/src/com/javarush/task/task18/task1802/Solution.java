package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        long minbyte = inputStream.read();
        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            long data = inputStream.read(); //прочитать очередной байт
            minbyte = Math.min(minbyte, data);
        }
        inputStream.close(); // закрываем поток
        System.out.println(minbyte); //выводим минбайт на экран.
    }
}
//1802
//Вы решили задачу лучше, чем 18% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.86.
//Всего эту задачу решили 31601 учеников.

//Минимальный байт
//Ввести с консоли имя файла.
//Найти минимальный байт в файле, вывести его на экран.
//Закрыть поток ввода-вывода.