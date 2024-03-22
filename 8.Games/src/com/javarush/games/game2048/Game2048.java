package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                setCellColor(x, y, Color.CHARTREUSE);

            }
        }
    }

    private void createNewNumber() {
        getRandomNumber(SIDE);
        getRandomNumber(SIDE);
        getRandomNumber(10);

        int pust = 0;
        for (int[] mF : gameField) {
            for (int f : mF)
                if (f == 0)
                    pust++;
        }
        if (pust == 0)
            return;
        int newNumber = 2;
        if (getRandomNumber(10) == 9)
            newNumber = 4;

        int field = getRandomNumber(pust) + 1;

        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++) {
                int f = gameField[i][j];
                if (f == 0)
                    field--;
                if (field == 0) {
                    gameField[i][j] = newNumber;
                    return;
                }
            }
    }
}
