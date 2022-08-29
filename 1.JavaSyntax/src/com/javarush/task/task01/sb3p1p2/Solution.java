package com.javarush.task.task01.sb3p1p2;

import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int ch = Integer.parseInt(reader.readLine());

        if (ch == 1)
            System.out.print("Duku is here");
        else if(ch == 2)
            System.out.print("It’s a trap");

    }
}