package com.javarush.task.task01.sb3p1p8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zvezda {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
