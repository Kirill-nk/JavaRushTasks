package com.javarush.task.pro.task11.task1120;

import java.util.Locale;
import java.util.Scanner;

/* 
Все буквы маленькие
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        System.out.println(line.toLowerCase());
    }
}
