package com.javarush.task.task18.task1803;

import java.io.*;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            Map<Integer, Integer> byteMap = new HashMap<>();
            int currentByte;
            while ((currentByte = fileInputStream.read()) != -1) {
                if (!byteMap.containsKey(currentByte)) {
                    byteMap.put(currentByte, 1);
                } else {
                    Integer value = byteMap.get(currentByte);
                    byteMap.put(currentByte, value + 1);
                }
            }

            Integer max = Collections.max(byteMap.values());
            for (Map.Entry<Integer, Integer> entry : byteMap.entrySet()) {
                if (entry.getValue().equals(max)) {
                    System.out.print(entry.getKey() + " ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

//Вы решили задачу лучше, чем 61% учеников. Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 3.23.
// Всего эту задачу решили 31446 учеников.