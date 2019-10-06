package com.kodilla.sudoku;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    SudokuElement[][] board = new SudokuElement[10][];

    public Board() {
        for (int n = 0; n < 10; n++) {
            board[n] = new SudokuElement[10];
        }
    }

    public SudokuElement getValue(int x, int y) {
        return board[x][y];
    }

    public void setValue(SudokuElement sudokuElementValue, int x, int y) {
        board[x][y] = sudokuElementValue;
    }

    public String toString() {
        String result = "";
        for (int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for (int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if (board[n][k] == null) {
                    result += " - ";
                } else {
                    result += (board[n][k]).getFieldValue();
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}