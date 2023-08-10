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
        List<Voter> vList = Voter.generateVoters();
        Rewards vMap = new Rewards();
        Voter votKey;
        Map votValue;

        for (int i = 0; i < vList.size(); i++) {
            if (vList.get(i).getPersonalQuality().equals("Good")) {
                votKey = vList.get(i);
                votValue = vMap.getGoodRewardsMap();
            }
        }
    }


    public static void printMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}