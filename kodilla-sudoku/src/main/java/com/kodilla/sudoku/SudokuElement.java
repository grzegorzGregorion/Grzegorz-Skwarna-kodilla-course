package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SudokuElement {
    public static final int EMPTY = -1;
    private Integer fieldValue;
    private List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        this.fieldValue = EMPTY;
        IntStream.range(1, 10).forEach(possibleValues::add);
    }

    public Integer getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Integer fieldValue) {
        this.fieldValue = fieldValue;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }
}
