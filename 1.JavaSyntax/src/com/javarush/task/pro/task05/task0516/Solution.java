package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int a=0, b, c=array.length;
        b=c%2==0?c/2:c/2+1;
        Arrays.fill(array, a, b, valueStart);
        Arrays.fill(array, b, c, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
