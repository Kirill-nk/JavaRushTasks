package com.javarush.task.task01.sb2p2p7;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
//почему 212 только в ответе так
        int jedis = 212;
        Scanner scanner = new Scanner(System.in);
        int joda = scanner.nextInt();
        System.out.println(jedis - joda);
    }
}
