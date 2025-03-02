package com.javarush.task.task18.task1805;

import java.io.*;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            Set<Integer> uniqueBytes = new HashSet<>();
            int currentByte;
            while ((currentByte = fileInputStream.read()) != -1) {
                uniqueBytes.add(currentByte);
            }
            List<Integer> sortedBytes = new ArrayList<>(uniqueBytes);
            Collections.sort(sortedBytes);

            for (int b: sortedBytes){
                System.out.printf(b + " ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
