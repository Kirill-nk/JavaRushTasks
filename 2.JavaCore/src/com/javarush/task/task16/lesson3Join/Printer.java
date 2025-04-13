package com.javarush.task.task16.lesson3Join;

public class Printer implements Runnable {


    private String name;

    public Printer(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("I'm " + this.name);
    }

    public static void main(String[] args) throws InterruptedException {
        Printer printer1 = new Printer("Николай");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        thread1.join();
    }
}
