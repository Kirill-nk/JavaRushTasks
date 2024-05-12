package com.javarush.task.task16.task1607;

import java.util.ArrayList;
import java.util.List;

public class CopySolution {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses1 = prepareHorsesAndStart(10);
//        while (calculateHorsesFinished(horses1)) != horses1.size()) {
//        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        //Напишите ваш код тут
        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 0; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        System.out.println("All horses start the race!");
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}

class Horse1 extends Thread {

    private boolean isFinished;

    public Horse1(String name) {
        super(name);
    }

    public void run() {
        String s = "";
        for (int i = 0; i < 1001; i++) {
            s += "" + i;
            if (i == 1000) {
                s = " has finished the race!";
                System.out.println(getName() + s);
                isFinished = true;
            }
        }
    }
}