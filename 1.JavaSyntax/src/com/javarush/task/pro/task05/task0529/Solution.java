package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

/* 
Галаксианские роботанки (1)
*/

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];


    public static void main(String[] args) {
        for (int i = 0; i < height; i++) {
            Arrays.fill(field[i], empty);
        }

        for (int i = 0; i < field.length; i++) {
            int j = (int) (Math.random() * width);
            field[i][j] = robotank;
        }
        int count = 10;
        while (count > 0) {
            bombs = new int[height][width];
            for (int i = 0; i < bombs.length; i++) {
                for (int j = 0; j < 10; ) {
                    int k = (int) (Math.random() * width);
                    if (bombs[i][k] == 0) {
                        bombs[i][k] = 1;
                        j++;
                    }
                }
            }
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (field[i][j].equals(robotank) && bombs[i][j] == 1) {
                        field[i][j] = hit;
                        count--;
                    }

                }

            }
        }

        for (String[] strings : field) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}