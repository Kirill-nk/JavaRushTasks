package com.javarush.task.task01.sb2p1p8;

import java.net.SocketOption;

public class Solution {
    public static void print3(String s) {
        System.out.print(s + " " + s + " " + s + " ");
    }

    public static void main(String[] args) {
        print3("dump");
        print3("cargo");
    }
}