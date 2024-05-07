package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) throws IOException {
        System.out.println(lines);
    }
}


//1525. Файл в статическом блоке
//Вы решили задачу лучше, чем 7% учеников.
//Вам удалось ее решить с 4 попытки.
//Среднее количество попыток для этой задачи 1.94.
//Всего эту задачу решили 35068 учеников.