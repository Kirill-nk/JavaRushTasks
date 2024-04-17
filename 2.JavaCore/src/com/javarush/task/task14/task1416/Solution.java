package com.javarush.task.task14.task1416;

/* 
Стой, кто плывет?
*/

public class Solution {
    public static void main(String[] args) {
        CanSwim creature = new Orca() {
            @Override
            public void walk() {

            }

            @Override
            CanSwim getCurrentCreature() {
                return this;
            }
        };
        creature.swim();
        creature = new Whale() {
            @Override
            public void walk() {

            }

            @Override
            CanSwim getCurrentCreature() {
                return this;
            }
        };
        creature.swim();
        creature = new RiverOtter() {
            @Override
            public void swim() {

            }

            @Override
            public void walk() {

            }
        };
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

    static abstract class Orca extends SeaCreature implements CanSwim {
        public abstract void walk();

        @Override
        CanSwim getCurrentCreature() {
            return this;
        }
    }

    static abstract class Whale extends SeaCreature implements CanSwim {
        public abstract void walk();
    }

    static abstract class RiverOtter implements CanSwim, CanWalk {
    }
}
