package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        int index = url.indexOf("?");
        String view = url.substring(index+1);
        String[] strings = view.split("&");

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains("=")) {
                int idx = strings[i].indexOf("=");
                String str = strings[i].substring(0, idx);
                System.out.print(str + " ");
            } else {
                System.out.print(strings[i] + " ");
            }
        }

//        выучить методы класса стринг

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
