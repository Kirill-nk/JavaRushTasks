package com.javarush.task.pro.task13.task1335;

/* 
Дорога к выходу
*/

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printList(clearBoard());
    }

    public static List<Board.Node> clearBoard() {
        Board board = new Board();
        String nsList = new LinkedList<>(board.getBoardNodes());
        for (var i:nsList) {
            if (i.getData().contains("snake")) {
                i.setData("board");
            }
        }
        return nsList;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}
