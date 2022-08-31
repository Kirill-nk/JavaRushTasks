package com.javarush.task.task01.sb3p1p8;

import java.io.*;

public class SolutionR {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int a = m; a != 0; a--) {
            for (int b = n; b != 0; b--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

