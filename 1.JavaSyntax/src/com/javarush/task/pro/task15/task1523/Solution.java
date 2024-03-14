package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        connection.getOutputStream();

// читаем данные
        try(InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready())
                System.out.println(reader.readLine());
        }
    }
}

//1523
//Вы решили задачу лучше, чем 2% учеников.
//Вам удалось ее решить с 6 попытки.
//Среднее количество попыток для этой задачи 1.78.
//Всего эту задачу решили 9587 учеников.