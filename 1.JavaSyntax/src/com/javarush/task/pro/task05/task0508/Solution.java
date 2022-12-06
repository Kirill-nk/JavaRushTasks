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

            strings [i] = null;
            for (int j = 0; j < 6; j++) {
                {
                    if (strings[i] == strings[j]) {
                    else strings[i] == null;
                    }
                    System.out.print(strings[j] + ", ");
                }
            }
        }
    }
}