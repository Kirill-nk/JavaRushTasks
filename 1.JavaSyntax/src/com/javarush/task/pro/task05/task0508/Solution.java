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
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();

        }
        String rep = 0;
        for (int i = 5; i >= 0; i--)
        {
            if (strings[i] == rep)
                rep = null;

            System.out.print(strings[i] + ", ");
        }
    }
}
