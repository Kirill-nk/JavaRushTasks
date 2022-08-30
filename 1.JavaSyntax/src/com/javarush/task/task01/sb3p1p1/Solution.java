package com.javarush.task.task01.sb3p1p1;


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя1 ");
        String name1 = reader.readLine();
        System.out.print("Введите имя2 ");
        String name2 = reader.readLine();

        if (((name1.equals("Anakin"))|(name1.equals("Obi-Wan")))&((name2.equals("Obi-Wan"))|(name2.equals("Anakin"))))
            System.out.println(name1 + " and " + name2 + " - friends");
        else if (((name1.equals("Anakin"))||(name1.equals("Obi-Wan")))&&((!name2.equals("Obi-Wan"))&&(!name2.equals("Anakin"))))
            System.out.println(name1 + " - friend, " + name2 + " - foe");
        else if (((!name1.equals("Anakin"))&&(!name1.equals("Obi-Wan")))&&((name2.equals("Obi-Wan"))||(name2.equals("Anakin"))))
            System.out.println(name2 + " - friend, " + name1 + " - foe");
        else
            System.out.println(name1 + " and " + name2 + " - foes");
        }

    }
