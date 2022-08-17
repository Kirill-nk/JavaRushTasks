package com.javarush.task.task01.sb2p1p3;

import java.util.SplittableRandom;

public class Solution {
    public static void main(String[] args) {
        Zam zam = new Zam();
        Dron dron = new Dron();
        zam.spy = dron;
        dron.hunter = zam;
    }

    public static class Zam {
        public int age;
        public int height;
        public Dron spy;
    }

    public static class Dron {
        public String paragliderclass;
        public String paraglidermanufacturing;
        public Zam hunter;

    }
}
