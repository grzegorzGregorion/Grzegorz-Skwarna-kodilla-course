package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuBoard {
    private List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        IntStream.range(0, 9).forEach(n -> rows.add(new SudokuRow()));
    }

    public Integer getElement(int col, int row) {
        return rows.get(row).getCols().get(col).getFieldValue();
    }

    public void setElement(int col, int row, Integer value) {
        rows.get(row).getCols().get(col).setFieldValue(value);
    }

    public List<Integer> getPossibles(int col, int row) {
        return rows.get(row).getCols().get(col).getPossibleValues();
    }

    public String toString() {
        String result = "";
        for (int n = 0; n <= 8; n++) {
            result += "|";
            for (int k = 0; k <= 8; k++) {
                if (getElement(n, k) == EMPTY) {
                    result += " ";
                } else {
                    result += getElement(n, k);
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}