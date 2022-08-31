package com.javarush.task.task01.sb3p1p8;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws  Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число m: ");
        int m = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Введите число n: ");
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print('*');
                } else {
                    if (j == 0 || j == m - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.print("\n\r");


        }
    }
}