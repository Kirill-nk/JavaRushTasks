package com.javarush.task.pro.task04.task0423;

/*
Калибровка климата
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        int average = 0;
        for (int i = 1; i < 6; i++) {
            average += scanner.nextInt();

        }
        System.out.println(average / count);
    }
}
