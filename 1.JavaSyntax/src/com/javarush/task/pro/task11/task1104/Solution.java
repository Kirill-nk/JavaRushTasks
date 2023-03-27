package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double iso_num = Math.round(Double.parseDouble(string));
        System.out.printf("%.0f",iso_num);
    }
}
