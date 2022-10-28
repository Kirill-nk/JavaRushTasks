package com.javarush.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Сумма кратных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        if (start > end)
            System.out.println("end должен быть больше start");
        else if (start <= end) {

            int sum = 0;
            int count = 0;
            for (int a = start; a < end; a++) {
                if ((a % multiple) != 0) continue;
                sum = count + a;
            }

            System.out.println(sum);
        }
    }
}
