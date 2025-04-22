package com.javarush.task.task18.task1803;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        try(FileInputStream fileInputStream = new FileInputStream(file)){
            Map<Integer, Integer> byteMapName = new HashMap<>();
            int currentByte;
            while ((currentByte= fileInputStream.read())!=-1){
                byteMapName.put(currentByte, byteMapName.get(currentByte));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
