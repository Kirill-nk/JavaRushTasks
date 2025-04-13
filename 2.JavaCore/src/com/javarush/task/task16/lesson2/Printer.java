package com.javarush.task.task16.lesson2;

public class Printer extends Thread {
    private String name;
    public Printer(String name){
        this.name = name;
    }
    public void run() {
        System.out.println("I,m " + this.name);
    }

    public static void main(String[] args) {
        Printer printer = new Printer("Василий");
        printer.start();

        Printer printer2 = new Printer("Николай");
        printer2.start();
    }
}
