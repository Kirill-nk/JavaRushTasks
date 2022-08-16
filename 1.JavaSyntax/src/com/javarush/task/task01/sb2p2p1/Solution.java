package com.javarush.task.task01.sb2p2p1;

public class Solution {
    public static void main(String[] args) {
        Owner owner_1 = new Owner();
        Pet pet_1 = new Pet();

        owner_1.name = "Mike";
        pet_1.kind = "cat";
        pet_1.color = "black";

        owner_1.pet = pet_1;
        owner_1.say();
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
