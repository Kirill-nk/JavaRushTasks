package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (var info : stackTrace)
            System.out.printf(OUTPUT_FORMAT, info.getMethodName(), info.getLineNumber(), info.getClassName(), info.getFileName());

    }
    static void makeScrewdriver() {
        addJuice();
    }
    static void addJuice() {
        addVodka();
    }
    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}

//1414
//Готовим коктейли
//Метод printStackTrace
//Вы решили задачу лучше, чем 5% учеников.
// Вам удалось ее решить с 4 попытки.
// Среднее количество попыток для этой задачи 1.81.
// Всего эту задачу решили 12224 учеников.