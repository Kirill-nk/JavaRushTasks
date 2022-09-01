package com.javarush.task.task01.sb3p1p9;

public class Main{
    public static void main(String[] args) {

    int count = 9;
    int number = 1;
    int mult = 1;
        while (mult != 10) {
        while (count != 0) {
            int result = number * mult;
            System.out.print(result);
            if (count != 1)
                System.out.print(" ");
            number++;
            count--;
        }
        number = 1;
        System.out.print("\n");
        count = 9;
        mult++;
    }
}
}
