package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static void main(String[] args) {

    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int min(int a, int b, int c, int d) {
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(e, Math.min(a, Math.min(b, Math.min(c, d))));
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static int max(int a, int b, int c, int d, int e) {
        return Math.max(e, Math.max(a, Math.max(b, Math.max(c, d))));
    }
}
//1708
//Вы решили задачу лучше, чем 2% учеников.
// Вам удалось ее решить с 6 попытки.
// Среднее количество попыток для этой задачи 1.86.
// Всего эту задачу решили 9851 учеников.