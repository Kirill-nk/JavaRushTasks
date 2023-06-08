package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/* 
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++)
            numbers.add(i);

        for (int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i));
    }

    public static void reverse() {
        for (int i = 10; i > 0; i--)
                list.add(i);

            for (int i = 0; i < numbers.size(); i++)
                System.out.println(list.get(i));


    }

    private static void print() {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
