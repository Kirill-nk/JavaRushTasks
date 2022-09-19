package oop.massiv;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {


                if (strings[i].equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;

                }

            }

        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }

    }

}
