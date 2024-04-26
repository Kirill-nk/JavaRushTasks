package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new IOException());
            exceptions.add(new InterruptedIOException());
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new ClassCastException());
            exceptions.add(new UnsupportedOperationException());
            exceptions.add(new IllegalAccessException());
            exceptions.add(new NegativeArraySizeException());
            exceptions.add(new EmptyStackException());
            exceptions.add(new SecurityException());
        }

        //напишите тут ваш код


    }
}
//1419. Нашествие исключений
//Вы решили задачу лучше, чем 11% учеников. Вам удалось ее решить с 4 попытки. Среднее количество попыток для этой задачи 2.36. Всего эту задачу решили 36906 учеников.