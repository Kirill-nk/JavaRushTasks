package com.javarush.task.pro.task13.task1334;

/* 
Антипирамида
*/

import java.util.*;

public class Solution {
    static Map<Voter, Map<String, String>> corporatePyramid = new HashMap<>();

    public static void main(String[] args) {
        setRewards();
        printMap(corporatePyramid);
    }

    public static void setRewards() {
        List<Voter> list = Voter.generateVoters();
        Rewards rewards = new Rewards();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersonalQuality().equals("Good")) {
                corporatePyramid.put(list.get(i), rewards.getGoodRewardsMap());
            }
            else if (list.get(i).getPersonalQuality().equals("Holy")) {
                corporatePyramid.put(list.get(i), rewards.getHolyRewardsMap());
            }
        }
    }


    public static void printMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}