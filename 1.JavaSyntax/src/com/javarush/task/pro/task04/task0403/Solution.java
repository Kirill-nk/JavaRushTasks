package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            String v = scanner.nextLine();
            if (v.equals("ENTER")) {
                isExit = true;
            } else {
                int number = Integer.parseInt(v);
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}