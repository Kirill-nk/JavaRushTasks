package com.javarush.task.pro.task06.task0621;

/* 
Что происходит?
*/

public class Solution {
    public static String demons = "демоны";

    public static void main(String[] args) {
        changeDemons();
    }
    public static void changeDemons() {
        demons = "погрузочные машины";
        if ("демоны".equals(demons)) {
            System.out.println("На друзей напали демоны.");
        }
        if ("погрузочные машины".equals(demons)) {
            System.out.println("Друзья превратили демонов в погрузочные машины.");
        }
    }
}
