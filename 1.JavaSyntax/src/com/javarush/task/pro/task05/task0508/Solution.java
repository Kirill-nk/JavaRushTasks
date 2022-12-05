package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();


        }
        for (int i = 0; i < 6; i++) {
            {
                System.out.print(strings[i] + ", ");
            }
        }
    }
}