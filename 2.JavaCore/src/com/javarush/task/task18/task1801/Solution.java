package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        long maxbyte = 0;
        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            long data = inputStream.read(); //прочитать очередной байт
            maxbyte = Math.max(maxbyte, data);

        }
        inputStream.close(); // закрываем поток

        System.out.println(maxbyte); //выводим максбайт на экран.

    }
}

//1801
//Вы решили задачу лучше, чем 5% учеников.
//Вам удалось ее решить с 5 попытки.
//Среднее количество попыток для этой задачи 2.06.
//Всего эту задачу решили 31826 учеников.

//Максимальный байт
//Ввести с консоли имя файла.
//Найти максимальный байт в файле, вывести его на экран.
//Закрыть поток ввода-вывода.