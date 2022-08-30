package com.javarush.task.task01.sb3p1p7;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите фразу: ");
        String frase = reader.readLine();
        System.out.print("Введите число сколько раз повторится фраза: ");
        int xc = Integer.parseInt(reader.readLine());
        if (xc < 1)
            System.out.println("Укажите чило больше 0");
        else
            while (xc!=0) {
        System.out.println(frase);
            xc--;
            }

    }


}
