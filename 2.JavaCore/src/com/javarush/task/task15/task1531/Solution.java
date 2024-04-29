package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        if (input > 150 && input < 0) {
            System.out.println("некорр");
        } else System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here

        BigInteger v = BigInteger.valueOf(n);
        BigInteger result = BigInteger.valueOf(1);

        if (n >= 0 && n < 151) {
            for (long i = 1; i <= n; i++) {
                BigInteger i2 = BigInteger.valueOf(i);
                result = result.multiply(i2);
            }
        } else return "0";
        return result.toString();
    }
}
//1531 Факториал
//Вы решили задачу лучше, чем 0% учеников. Вам удалось ее решить с 20 попытки. Среднее количество попыток для этой задачи 3.59. Всего эту задачу решили 35714 учеников.