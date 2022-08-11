package com.javarush.task.task01.sb2p1p4;

public class Solution {
    public static void main(String[] args) {
        Jedi jedi1 = new Jedi();
        Jedi jedi2 = new Jedi();
        Jedi jedi3 = new Jedi();
        jedi1.name = "Obi-Wan";
        jedi2.name = "Anakin";
        jedi3.name = "Joda";

    }

    public static class Jedi {
        public String name;
    }
}