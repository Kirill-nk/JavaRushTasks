package com.javarush.task.task14.task1416;

/* 
Стой, кто плывет?
*/

public class Solution {
    public static void main(String[] args) {
        CanSwim creature = new Orca();
        creature.swim();
        creature = new Whale();
        creature.swim();
        creature = new RiverOtter();
        creature.swim();
    }

    public static void test(CanSwim creature) {
        creature.swim();
    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature {
        public void swim() {
            SeaCreature currentCreature = (SeaCreature) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca extends SeaCreature implements CanSwim {

        @Override
        CanSwim getCurrentCreature() {
            return this;
        }
    }

    static class Whale extends SeaCreature implements CanSwim {

        @Override
        CanSwim getCurrentCreature() {
            return this;
        }
    }

    static class RiverOtter implements CanSwim,CanWalk {
        @Override
        public void walk() {

        }

        @Override
        public void swim() {

        }
    }
}


//1416. Стой, кто плывет?
//Вы решили задачу лучше, чем 0% учеников. Вам удалось ее решить с 18 попытки. Среднее количество попыток для этой задачи 1.92. Всего эту задачу решили 40459 учеников.