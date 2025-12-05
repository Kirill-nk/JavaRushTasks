package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/

public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAdress = new byte[4];
        for (int i = 0; i < 4; i++) {
            netAdress[i] = (byte) (ip[i] & mask[i]);
        }
        return netAdress;
    }

    public static void print(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            String bynary = String.format("%8s", Integer.toBinaryString(bytes[i] & 0xFF)).replace(' ', '0');
            System.out.print(bynary);
            if (i < bytes.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

/*
Задача 2101 успешно прошла тестирование!
Вы решили задачу лучше, чем 2% учеников.
Вам удалось ее решить с 6 попытки.
Среднее количество попыток для этой задачи 1.63.
Всего эту задачу решили 18757 учеников.
 */