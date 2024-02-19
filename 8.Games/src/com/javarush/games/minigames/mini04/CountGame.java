package com.javarush.games.minigames.mini04;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Считаем клетки
*/

public class CountGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        for (int j = 0; j < 50; j++) {
            int x = getRandomNumber(10);
            int y = getRandomNumber(10);
            setCellColor(x, y, Color.GREEN);
            setCellNumber(x, y, getRandomNumber(100));
        }
        showResult();
    }

    public void showResult() {
        //напишите тут ваш код
        int sum=0;
        int count=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (getCellColor(i,j)==Color.GREEN){
                    sum = sum + getCellNumber(i, j);
                    count = count + 1;
                }
            }
        }
        printSum(sum);
        printCountOfGreenCells(count);
    }

    private void printSum(int sum) {
        System.out.println("Сумма всех чисел = " + sum);
    }

    private void printCountOfGreenCells(int count) {
        System.out.println("Количество зеленых клеток = " + count);
    }
}

//game04
//Вы решили задачу лучше, чем 17% учеников.
//Вам удалось ее решить с 3 попытки.
//Среднее количество попыток для этой задачи 2.22.
//Всего эту задачу решили 7056 учеников.