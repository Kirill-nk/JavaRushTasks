package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут



        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        @Override
        public void run() {
        while (!isInterrupted())
            try {
                String a1 = reader.readLine();
                String b1 = reader.readLine();
                String c1 = reader.readLine();
            } catch (IOException e){
            }
        }
        public void printResult(){
            System.out.println();
        }
    }
}
