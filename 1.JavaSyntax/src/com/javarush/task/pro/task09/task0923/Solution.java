package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/

import static com.javarush.task.pro.task09.task0923.CaptainBridge.*;

public class Solution {
    public static void main(String[] args) {
        String[] ranks = new String[]{"Раб", "Гость", "Боец", "Ветеран", "Картографист", "Капитан", "Стив"};
        String rank = "";
        for (int i = 0; i < ranks.length; i++) {
            if (debugAccess(ranks[i])) {
                rank = ranks[i];
            }
        }
        checkAccess(rank);
    }
}
