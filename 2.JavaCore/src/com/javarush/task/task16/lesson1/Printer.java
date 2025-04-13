package com.javarush.task.task16.lesson1;

public class Printer implements Runnable {
    private String name;
    public Printer(String name) {
        this.name = name;
    }
    public void run(){
        System.out.println("I'm " + this.name);
    }

    public static void main(String[] args) {
        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer printer2 = new Printer("Василий");
        Thread thread2 = new Thread(printer2);
        thread2.start();

        Printer printer = new Printer("Наташка");

        Thread thread3 = new Thread(printer);
        thread3.start();

        Thread thread4 = new Thread(printer);
        thread4.start();

        Thread thread5 = new Thread(printer);
        thread5.start();

    }
}
