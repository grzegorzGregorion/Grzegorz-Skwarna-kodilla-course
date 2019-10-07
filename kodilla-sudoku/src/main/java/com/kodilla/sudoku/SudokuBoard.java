package com.kodilla.sudoku;

import java.util.List;

public class SudokuBoard {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 8;
    SudokuRow[][] board = new SudokuRow[9][];

    public SudokuBoard() {
        for (int n = 0; n < 9; n++) {
            board[n] = new SudokuRow[9];
        }
    }

    public SudokuRow getValue(int x, int y) {
        return board[x][y];
    }

    public SudokuElement setValue(SudokuElement sudokuElementValue, int x, int y) {
        board[x][y] = new SudokuRow((List<SudokuElement>) sudokuElementValue, 9);
        return sudokuElementValue;
    }

    public String toString() {
        String result = "";
        for (int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for (int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if (board[n][k] == null) {
                    result += " - ";
                } else {
                    result += (board[n][k].getSudokuRow().get(n));
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}