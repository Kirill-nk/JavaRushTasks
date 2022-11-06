package com.javarush.task.pro.task04.task0425;

/* 
Диггер (1)
*/

import java.util.Locale;

public class Solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {


        for (int i = 0; i < 9; i++) {

//            for (int j = 0; j < 10; j++)
                System.out.print(land+land+land+hole+
                        land+land+land+land+land+land);
            System.out.println();

            }
//        System.out.println(land+land+land+robot+
//                land+land+land+land+land+land);
        for (int k = 0; k < 10; k++) {
                System.out.print(death);
        }

    }
}
