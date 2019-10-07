package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> sudokuRow = new ArrayList<>();
    int sudokuRowLength;

    public SudokuRow(List<SudokuElement> sudokuRow, int sudokuRowLength) {
        this.sudokuRow = sudokuRow;
        for (int n=0; n<= sudokuRowLength; n++) {
            sudokuRow.add(n, new SudokuElement(0));
        }
    }

    public List<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }

    public int getSudokuRowLength() {
        return sudokuRowLength;
    }
}
