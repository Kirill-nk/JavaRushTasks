package com.javarush.task.pro.task05.task0526;

/* 
Атака вирусов
*/
import java.util.Arrays;

public class Solution {
    public static int[][] array = {
        {1,2,3,4},
        {4,5,6,7},
        {7,8,9,0}
    };

    public static void main(String[] args) {
        printArray();
        int[][] tmp = new int[3][4];
        int cnt = 0;
        for (int i = args.length-1; i>=0; i--) {
            tmp[cnt]=array[i].clone();
            cnt++;
        }
        array = tmp.clone();
        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
