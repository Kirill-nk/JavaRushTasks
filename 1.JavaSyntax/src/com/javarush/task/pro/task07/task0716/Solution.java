package com.javarush.task.pro.task07.task0716;

/* 
Запуск систем корабля
*/

public class Solution {
    public static char[] chars = {1076, 1086, 1088, 1084, 1080, 1053};

    public static void main(String[] args) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[chars.length - i - 1]);
        }

    }
}
