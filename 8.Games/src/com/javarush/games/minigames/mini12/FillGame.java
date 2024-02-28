package com.javarush.games.minigames.mini12;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

/* 
Работаем со списком координат
*/

public class FillGame extends Game {
    private final List<Cell> cells = new ArrayList<>();

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        setCellColor(x,y, Color.ORANGE);
        Cell find = new Cell(x,y);
        int i = (int) cells.stream().filter(o -> o.equals(find)).count();
        if (i == 0){
            cells.add(find);
//Решение  валидатора
// final Cell current = new Cell(x, y);
//        if (!cells.contains(current)) {
//            cells.add(current);
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x,y, Color.WHITE);
        Cell find = new Cell(x,y);
        int i = (int) cells.stream().filter(o -> o == find).count();
        if (i == 0){
            cells.remove(find);

//      Решение валидатора
//            setCellColor(x, y, Color.WHITE);
//            final Cell current = new Cell(x, y);
//            cells.remove(current);
        }
    }
}
//game12
//Вы решили задачу лучше, чем 6% учеников.
//Вам удалось ее решить с 4 попытки.
//Среднее количество попыток для этой задачи 1.85.
//Всего эту задачу решили 6454 учеников.