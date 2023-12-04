package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


      try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                var read1 = inputStream.read();
                if (inputStream.available() > 0){
                    var read2 = inputStream.read();
                    outputStream.write((int) read2);
                    outputStream.write(read1);
                } else if (read1 % 2 !=0) {
                    outputStream.write(read1);
                }
                int length = inputStream.read(buffer);
                outputStream.write(buffer, 0, length);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }

    }
}