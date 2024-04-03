package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            while (true) {
                String text = scanner.nextLine();
                writer.write(text);
                writer.newLine();
                if (text.equals("exit")) {
                    break;
                }
            }
        }
    }
}