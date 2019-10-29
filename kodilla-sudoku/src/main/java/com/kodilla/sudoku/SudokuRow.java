package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuRow {
    List<SudokuElement> cols = new ArrayList<>();

    public SudokuRow() {
        IntStream.range(0,9).forEach(n -> cols.add(new SudokuElement()));
    }

    public List<SudokuElement> getCols() {
        return cols;
    }
}
