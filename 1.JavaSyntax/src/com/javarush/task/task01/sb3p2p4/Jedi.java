package com.javarush.task.task01.sb3p2p4;

public class Jedi {

    String name;
    int count;
    String weapon;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void initialize(String name, int count, String weapon) {
        this.name = name;
        this.count = count;
        this.weapon = weapon;
    }

    public static void main(String[] args) {

    }
}