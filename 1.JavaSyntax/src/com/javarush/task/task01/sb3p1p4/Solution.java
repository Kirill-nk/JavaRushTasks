package com.javarush.task.task01.sb3p1p4;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int chis = Integer.parseInt(reader.readLine());

        boolean positive = false;
        boolean even = false;
        if (chis > 0)
            positive = true;
        if (chis % 2 == 0)
            even = true;
        if (chis == 0)
            System.out.println("balance");
        else if (positive && even)
            System.out.println("compassion");
        else if (positive && !even)
            System.out.println("mercy");
        else if (!positive && even)
            System.out.println("pain");
        else if (!positive && !even)
            System.out.println("anger");
    }
}
