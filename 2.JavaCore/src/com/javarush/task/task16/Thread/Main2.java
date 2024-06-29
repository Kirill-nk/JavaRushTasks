package com.javarush.task.task16.Thread;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        float start = System.currentTimeMillis();

        Thread.sleep(3000);
        System.out.println(" - Сколько я проспал? \n - " + ((System.currentTimeMillis() - start)) / 1000 + " секунды");
    }
}
