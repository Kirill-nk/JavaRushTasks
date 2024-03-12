package com.javarush.task.pro.task14.task1422;

/* 
Сбор и сканирование ДНК
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printDNA();
    }

    public static void printDNA() {
        //напишите тут ваш код
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for (StackTraceElement[] stackTraceElements : getDNA()) {
            StackTraceElement traceElement = stackTraceElements[1];
            System.out.printf("File name: %s, Method name: %s, Line number: %d\n",
                    traceElement.getFileName(), traceElement.getMethodName(), traceElement.getLineNumber());
        }
    }

    private static List<StackTraceElement[]> getDNA() {
        List<StackTraceElement[]> list = new ArrayList<>();

        list.add(adenine());
        list.add(thymine());
        list.add(cytosine());
        list.add(guanine());

        return list;
    }

    private static StackTraceElement[] adenine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] thymine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] cytosine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] guanine() {
        return Thread.currentThread().getStackTrace();
    }
}

//1422
//Вы решили задачу лучше, чем 1% учеников.
//Вам удалось ее решить с 8 попытки.
//Среднее количество попыток для этой задачи 1.74.
//Всего эту задачу решили 599 учеников.