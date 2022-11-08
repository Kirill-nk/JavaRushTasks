package com.javarush.task.pro.task04.task0416;
import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        double firstCh = sd.nextInt();
        double secondCh = sd.nextInt();
        System.out.format("%.1f",(firstCh/secondCh));

    }
}