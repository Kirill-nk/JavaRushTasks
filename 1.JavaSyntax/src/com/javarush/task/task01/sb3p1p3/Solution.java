package com.javarush.task.task01.sb3p1p3;


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int chi = Integer.parseInt(reader.readLine());

        if (chi < 0)
            System.out.println("it’s Dark side");
        else if (chi > 0)
            System.out.println("it’s Light side");
        else
            System.out.println("it’s balance");

    }
}