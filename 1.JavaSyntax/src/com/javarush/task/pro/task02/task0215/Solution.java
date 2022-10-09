package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch1 = scanner.nextInt();
        int ch2 = scanner.nextInt();
        int ch3 = scanner.nextInt();

        System.out.println((ch1 + ch2 + ch3)/3);

    }
}
