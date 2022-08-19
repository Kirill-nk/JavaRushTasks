package com.javarush.task.task01.sb2p2p3;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String phrase = bufferedReader.readLine();

        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();


        System.out.println(phrase);
    }
}
