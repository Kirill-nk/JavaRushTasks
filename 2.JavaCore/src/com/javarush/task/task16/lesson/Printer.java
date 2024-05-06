package com.javarush.task.task16.lesson;

public class Printer implements Runnable {
    public void run() {
        System.out.println("I'm printer");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread chieldThread = new Thread(printer);
        chieldThread.start();
    }
}
