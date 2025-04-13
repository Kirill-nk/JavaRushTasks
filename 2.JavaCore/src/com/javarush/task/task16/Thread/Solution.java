package com.javarush.task.task16.Thread;

public class Solution {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 15; i++) {
            System.out.println("Это главный поток. Шаг № " + i++);

        }
    }
}


class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Это поток MyTread. Шаг № " + i++);

        }
    }
}
