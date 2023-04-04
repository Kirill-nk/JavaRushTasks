package com.javarush.task.pro.task09.task0924;

/* 
Взлом Стального Стива
*/

import java.util.Arrays;

public class Solution {

    public static String[][] morals = {{"iAmAKiller", "iAmAThief", "honesty", "responsibility", "iAmABully"},
            {"BuLLyIAmA", "honesty", "iamakiller", "iamathief", "responsibility"},
            {"honesty", "iamabully", "responsibility", "AthiefIAm", "ikillerAmA"},
    };

    public static void main(String[] args) {
        cleanMorals();
        for (String[] strings : morals) {
            System.out.println(Arrays.toString(strings));
        }
    }

    public static void cleanMorals() {
        for (int i = 0; i < morals.length; i++) {
            for (int j = 0; j < morals[i].length; j++) {
                String morals2 = morals[i][j].toLowerCase();
                String replaceok;
                int index = morals2.indexOf("killer");
                replaceok = "compassion";
                if (index < 0) {
                    index = morals2.indexOf("thief");
                    replaceok = "fairness";
                }
                if (index < 0){
                    index = morals2.indexOf("bully");
                    replaceok = "respect";
                }
                if (index < 0){
                    continue;
                }

                morals[i][j] = replaceok;

            }
        }



    }
}