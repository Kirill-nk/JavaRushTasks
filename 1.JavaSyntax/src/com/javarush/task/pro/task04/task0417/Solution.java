package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner reed = new Scanner(System.in);
        int ms = reed.nextInt();


        System.out.println(Math.round(3.6 * ms));

    }
}