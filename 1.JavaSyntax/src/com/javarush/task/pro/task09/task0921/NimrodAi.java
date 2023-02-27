package com.javarush.task.pro.task09.task0921;

/* 
Пиратский разворот
*/

import java.util.Arrays;
import java.util.Locale;

public class NimrodAi {
    
    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (PastryLoader pastryLoader : pastryLoaders) {
            String[][][] memory = pastryLoader.memory;
            for (int i = 0; i < memory.length; i++) {
                for (int j = 0; j < memory[i].length; j++) {
                    for (int k = 0; k < memory[i][j].length; k++) {
                        String string = memory[i][j][k];
                        String str = string.toLowerCase();
                        if (str.contains("nimrod")){
                            String replace = str.replace("nimrod", "pirate ship");
                            memory[i][j][k] = replace;

                        }
                    }

                }

            }

        }

    }
}
