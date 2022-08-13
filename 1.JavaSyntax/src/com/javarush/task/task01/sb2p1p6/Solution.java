package com.javarush.task.task01.sb2p1p6;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Clone1 clone1 = new Clone1();
        Clone2 clone2 = new Clone2();
        Clone3 clone3 = new Clone3();
        Dias dias = new Dias();
        clone1.owner= dias;
        clone2.owner= dias;
        clone3.owner= dias;

    }
    public static class Clone1 {
        public Dias owner;
    }
    public static class Clone2 {
        public Dias owner;
    }
    public static class Clone3 {
        public Dias owner;
    }
    public static class Dias {
    }

}
