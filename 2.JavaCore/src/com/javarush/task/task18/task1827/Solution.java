package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        if (args.length == 0) {
            System.out.println("Запущено без параметров");
            return;
        }
        if (args.length >= 4 && args[0].equals("-c")) {

            int maxId = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    int id = Integer.parseInt(line.substring(0, 8).trim());
                    if (id > maxId) {
                        maxId = id;
                    }
                }
            }

            String newLine = checkLength(String.valueOf(maxId+1), 8)
                    + checkLength(args[1], 30)
                    + checkLength(args[2], 8)
                    + checkLength(args[3], 4);


            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                writer.newLine();
                writer.write(newLine);
            }
        }
    }

    private static String checkLength (String string, int limit){
        if(string.length() > limit){
            return string.substring(string.length(), limit);
        } else {
            StringBuilder builder = new StringBuilder(string);
            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}