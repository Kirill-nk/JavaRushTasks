package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    public void initialize(){
        setScreenSize(SIDE,SIDE);
        GameObject[][] gameField = new GameObject[SIDE][SIDE];
        createGame();
    }
    private void createGame(){
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                setCellColor(x,y, Color.LAWNGREEN);
            }
        }
    }
}
