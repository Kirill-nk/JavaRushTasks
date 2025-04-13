package com.javarush.task.task16.Thread;

public class Solution2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread myThread = new Thread(counter);
        myThread.start();

        for (int i = 0; i < 15; i++) {
            System.out.println("Это главный поток. Шаг № " + i);
        }
    }
}

class Counter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Это поток Counter. Шаг № " + i);
        }
    }
}
