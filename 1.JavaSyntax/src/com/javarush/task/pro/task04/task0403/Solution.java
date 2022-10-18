package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean enter = false;

        while (!enter) {
            String sum = scanner.nextLine();
            enter = sum.equals("enter");
        }

        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            sum = sum + x;

        }
        System.out.println(sum);
    }

}