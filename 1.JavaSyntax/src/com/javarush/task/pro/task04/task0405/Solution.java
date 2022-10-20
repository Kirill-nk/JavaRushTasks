package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (a < 1) {
            System.out.println("ББББББББББББББББББББ");
           a = 1;
            for (int i = 0; i < 8; i++) {
                System.out.println("Б                  Б");
            }
            while (b < 1) {
                System.out.print("ББББББББББББББББББББ");
                b = 1;
            }
        }
    }
}