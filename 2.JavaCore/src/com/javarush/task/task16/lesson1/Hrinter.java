package com.javarush.task.task16.lesson1;

public class Hrinter implements Runnable {
    private String name;

    public Hrinter(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("I'm " + this.name);
    }
    public static void main(String[] args) {
        Hrinter hrinter = new Hrinter("Наташка");

        Thread thread1 = new Thread(hrinter);
        thread1.start();

        Thread thread2 = new Thread(hrinter);
        thread2.start();

        Thread thread3 = new Thread(hrinter);
        thread3.start();


    }
}
