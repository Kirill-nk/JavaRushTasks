package com.javarush.task.pro.task12.task1225;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Аккаунт ИнстаМатрицы
*/

public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");
        for (String account : accountsList){
            System.out.println(account);
        }
    }

    public static void convertAccounts() {
        for (int i = 0; i < Accounts.getAccounts().length; i++) {
            accountsList.add(Accounts.getAccounts()[i]);
        }
    }

    public static void registerAccount(String username) {
        if(!accountsList.contains(username)){
            accountsList.add(username);
        }
    }
}