package com.javarush.task.task12.task1203;

/* 
Кесарю — кесарево
*/

public class Solution {
    public static void main(String[] args) {
        Pet pet1 = new Cat(); //Создаем ссыллку класса Pet и называем ее pet1. А объект создаем класса Cat.
        Pet cat = pet1.getChild(); //Тут мы вызываем метод getChild() у объекта pet1. Но так как у нас ссылка на этот объект имеет класс Pet, то вызывается метод родительского класса Pet.

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();


    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat();
        }
    }


    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
//1203
//Вы решили задачу лучше, чем 0% учеников. Вам удалось ее решить с 5 попытки.
// Среднее количество попыток для этой задачи 1.15. Всего эту задачу решили 49231 учеников.