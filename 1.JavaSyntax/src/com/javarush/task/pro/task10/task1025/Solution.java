package com.javarush.task.pro.task10.task1025;

/* 
Взлом ретранслятора
*/

public class Solution {

    public static void main(String[] args) {
        Repeater repeater = new Repeater();
        int frequency = repeater.getFrequency();
        if (frequency<100){
            frequency=frequency*10;
            System.out.println(frequency);
        }

        String trektoria = repeater.getTrajectory();
        if (trektoria.equals("parabolic")) {
            System.out.println("elliptic");
        }

    }

}