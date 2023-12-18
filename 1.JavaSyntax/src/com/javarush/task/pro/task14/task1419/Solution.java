package com.javarush.task.pro.task14.task1419;

/* 
Проверка Робозомби
*/

public class Solution {

    public static void main(String[] args) {
        startTest();
    }

    public static void startTest() {
        try {
            System.out.println(2 / 2);
            question2();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void question2() {
        try {
            System.out.println((new char[]{'1'}));
            question3();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void question3() {
        char[] array = {'T', 'e', 's', 't',};
        try {
            System.out.println(array[3]);
            question4();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void question4() {
        try {
            int num = Integer.parseInt("5");
            System.out.println("All tests passed. You may go.");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
//1419
//Вы решили задачу лучше, чем 1% учеников.
// Вам удалось ее решить с 13 попытки.
// Среднее количество попыток для этой задачи 1.63.
// Всего эту задачу решили 673 учеников.