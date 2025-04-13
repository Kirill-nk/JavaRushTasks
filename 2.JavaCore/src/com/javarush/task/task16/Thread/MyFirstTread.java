package com.javarush.task.task16.Thread;

public class MyFirstTread extends Thread{

    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());
    }
}

/*
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread();
            thread.run();
        }
    }
}

 */