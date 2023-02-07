package com.javarush.task.pro.task10.task1022;

/* 
Робозомби
*/

import java.util.Arrays;

public class Pepl {

    public static Battery[] batteryWarehouse = new Battery[100500];

    public static void main(String[] args) {
        Robot[] robots = new Robot[]{new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot()};
        System.out.println(Arrays.toString(robots));

        distributeBatteries(robots);

        System.out.println(Arrays.toString(robots));
    }

    public static void distributeBatteries(Robot[] robots) {
        int counter = 0;
        for (int i = 0; i < robots.length; i++) {
            do {
                robots[i].replaceBattery(batteryWarehouse[counter]);
                counter++;
            } while (robots[i].getCharge() < 20);
        }
    }
}
