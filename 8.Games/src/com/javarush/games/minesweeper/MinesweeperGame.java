package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    public void initialize(){
        setScreenSize(SIDE,SIDE);
        createGame();
    }
    private void createGame(){
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                gameField[y][x] = new GameObject(x, y);
                setCellColor(x,y, Color.LAWNGREEN);
            }
        }
    }
}
//4/16
//Вы решили задачу лучше, чем 82% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 5.24. Всего эту задачу решили 13934 учеников.