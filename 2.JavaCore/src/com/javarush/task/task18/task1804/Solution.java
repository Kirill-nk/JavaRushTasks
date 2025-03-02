package com.javarush.task.task18.task1804;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            Map<Integer, Integer> byteMap = new HashMap<>();
            int currentByte;
            while ((currentByte = fileInputStream.read()) != -1) {
                byteMap.put(currentByte, byteMap.getOrDefault(currentByte, 0) + 1);
            }

            int minFrequency = Integer.MAX_VALUE;
            for (int frequency : byteMap.values()) {
                if (frequency < minFrequency) {
                    minFrequency = frequency;
                }
            }

            for (Map.Entry<Integer, Integer> entry : byteMap.entrySet()) {
                if (entry.getValue() == minFrequency) {
                    System.out.print(entry.getKey() + " ");
                }
            }

        } catch (IOException e) {
        }
    }
}

