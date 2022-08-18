package com.javarush.task.task01.sb2p2p1;

public class Solution {
    public static void main(String[] args) {
        Owner owner1 = new Owner();
        Pet pet1 = new Pet();

        owner1.name = "Mike";
        pet1.kind = "cat";
        pet1.color = "black";

        owner1.pet = pet1;
        owner1.say();
    }
    static class Owner{
        String name;
        Pet pet;

        void say(){
            System.out.println("Hello, my name is " + name + " and my " + pet.kind + " is " + pet.color);
        }
    }
    static class Pet{
        String kind;
        String color;
    }
}
