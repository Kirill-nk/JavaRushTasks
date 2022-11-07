package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner into = new Scanner(System.in);
        double radius = into.nextInt();
        double pl = 3.14 * radius * radius;
        System.out.println((int) pl);
    }
}