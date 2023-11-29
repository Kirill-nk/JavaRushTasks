package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/
public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int m, int n, byte value) {
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, short value) {
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, int value) {
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, long value) {
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, float value) {
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, double value) {
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, char value) {
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, boolean value) {
        printMatrix(m, n, (Object) value);
    }
}

//1507
//Вы решили задачу лучше, чем 20% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.45.
//Всего эту задачу решили 39601 учеников.
