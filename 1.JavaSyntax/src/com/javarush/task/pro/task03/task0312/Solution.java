package com.javarush.task.pro.task03.task0312;

import java.util.Locale;
import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tx1 = scanner.nextLine();
        String tx2 = scanner.nextLine();
        String t1 = tx1.toUpperCase();
        String t2 = tx2.toUpperCase();

        if (t1 == t2){
            System.out.println("строки одинаковые");
        } else{
            System.out.println("строки разные");
        }
    }
}
