package com.javarush.task.pro.task02.task0214;

import java.util.Locale;
import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strx = scanner.nextLine();
        String stry = scanner.nextLine();
        String strz = scanner.nextLine();

        System.out.println(strz);
        System.out.println(stry.toUpperCase(Locale.ROOT));
        System.out.println(strx.toLowerCase(Locale.ROOT));

    }
}
