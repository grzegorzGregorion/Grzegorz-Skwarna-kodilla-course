package com.kodilla.sudoku;

public class SudokuElement {
    public static int EMPTY = -1;
    public static int fieldValue;

    public SudokuElement(int fieldValue) {
        if (fieldValue >= 1 || fieldValue <= 9) {
            this.fieldValue = fieldValue;
        } else if (fieldValue == 0) {
            this.fieldValue = EMPTY;
        } else {
            throw new IllegalStateException("Sudoku field value should be in range from 1 to 9");
        }
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public int getFieldValue() {
        return fieldValue;
    }

    public static void setEMPTY(int EMPTY) {
        SudokuElement.EMPTY = EMPTY;
    }

    public static void setFieldValue(int fieldValue) {
        SudokuElement.fieldValue = fieldValue;
    }
}
