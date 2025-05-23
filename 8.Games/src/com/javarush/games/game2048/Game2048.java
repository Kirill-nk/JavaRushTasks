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
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int number = getRandomNumber(10);
        if (gameField[x][y] == 0) {
            if (number < 9) {
                gameField[x][y] = 2;
            } else {
                gameField[x][y] = 4;
            }
        } else {
            createNewNumber();
        }
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.WHITE;
            case 2:
                return Color.LIGHTPINK;
            case 4:
                return Color.BLUEVIOLET;
            case 8:
                return Color.BLUE;
            case 16:
                return Color.CYAN;
            case 32:
                return Color.LIGHTSEAGREEN;
            case 64:
                return Color.LIMEGREEN;
            case 128:
                return Color.ORANGE;
            case 256:
                return Color.INDIANRED;
            case 512:
                return Color.RED;
            case 1024:
                return Color.MAGENTA;
            case 2048:
                return Color.MEDIUMVIOLETRED;
            default:
                return null;
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        setCellValueEx(x, y, color, value > 0 ? value + "" : "");
    }

    private boolean compressRow(int[] row) {
        int position = 0;
        boolean result = false;
        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) {
                if (i != position) {
                    row[position] = row[i];
                    row[i] = 0;
                    result = true;
                }
                position++;
            }
        }
        return result;
    }

    private boolean mergeRow(int[] row) {
        int position = 0;
        boolean result = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] == row[i + 1] && row[i] != 0) {
                row[i] += row[i];
                row[i + 1] = 0;
                result = true;

            }
        }
        return result;
    }

    @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) {
            moveLeft();
        } else if (key == Key.RIGHT) {
            moveRight();
        } else if (key == Key.UP) {
            moveUp();
        } else if (key == Key.DOWN) {
            moveDown();
        }

    }

    private void moveLeft() {

    }

    private void moveRight() {

    }

    private void moveUp() {

    }

    private void moveDown() {

    }

    private void rotateClockwise() {
        int rows = gameField.length;
        int[][] result = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                result[j][rows - i - 1] = gameField[i][j];
            }
        }
        gameField = result;
    }
}


//2048(10/18)
//Задача успешно прошла тестирование!  Вы решили задачу лучше, чем 1% учеников. Вам удалось ее решить с 11 попытки. Среднее количество попыток для этой задачи 2.22. Всего эту задачу решили 3296 учеников.