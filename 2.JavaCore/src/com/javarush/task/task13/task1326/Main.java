package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        List<Integer> list = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {

            while (reader.ready()) {
                String string = reader.readLine();
                int number = Integer.parseInt(string);
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

//Это копия Класса Солюшн