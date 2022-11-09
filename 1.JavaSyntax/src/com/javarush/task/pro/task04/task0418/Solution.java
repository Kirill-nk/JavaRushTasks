package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean water = scanner.nextBoolean();
        int result;
        if (water) {
            result = (int) Math.ceil(glass);
        } else {
            result = (int) Math.floor(glass);
        }
        System.out.println(result);
    }

}