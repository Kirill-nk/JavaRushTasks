package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        if(string.equals(Planet.MOON)){
            thePlanet = Moon.getInstance();
        } else if (string.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else if (string.equals(Sun.SUN)) {
            thePlanet = Sun.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
