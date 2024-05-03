package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count;
        int x = 0;
        int y = 0;

        try {
            x = Integer.parseInt(reader.readLine());
            y = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Введи с клавиатуры 2 целых положительных числа.");
        } finally {
            reader.close();
        }

        count = Math.min(x, y);

        for (int n = count; n >= 1; n--) {
            if (x % n == 0 && y % n == 0) {
                count = n;
                break;
            }
        }
        System.out.println(count);
    }
}