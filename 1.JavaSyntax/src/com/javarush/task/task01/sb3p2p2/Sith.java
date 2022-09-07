package com.javarush.task.task01.sb3p2p2;

public class Sith {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

        public static void main (String[]args) throws Exception {
            Human user = new Human("Mike", 32);

            String name = user.getName();
            int age = user.getAge();

            System.out.println(user.name);   // ! Ошибка, модификатор private
            System.out.println(user.age);   // ! Ошибка, модификатор private
        }

        static class Human {
            private String name;
            private int age;


        }
    }
}