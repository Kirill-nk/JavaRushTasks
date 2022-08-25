package com.javarush.task.task01.sb2p2p9;


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(sumDigitsInNumber(number));
    }

    public static int sumDigitsInNumber(int number) {
        return (number / 100 + number / 10 % 10 + number % 10);

    }
}
