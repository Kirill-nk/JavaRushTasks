package com.javarush.task.task01.sb2p2p6;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String magister = bufferedReader.readLine();
        String jedis = bufferedReader.readLine();

        System.out.println("Master " + magister + " is here with "+ jedis +" jedis");

    }
}