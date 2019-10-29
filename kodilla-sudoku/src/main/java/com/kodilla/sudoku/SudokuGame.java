//package com.kodilla.sudoku;
//
//public class SudokuGame {
//    private final SudokuBoard sudokuBoard;
//
//    SudokuGame(SudokuBoard sudokuBoard) {
//        this.sudokuBoard = sudokuBoard;
//    }
//
//    public SudokuBoard getSudokuBoard() {
//        return sudokuBoard;
//    }
//
//    public static class SudokuBuilder {
//        private SudokuBoard sudokuBoard = new SudokuBoard();
//
//        public SudokuBuilder SudokuElement(int fieldValue, int x, int y) {
//            if (x > SudokuBoard.MAX_INDEX || x < SudokuBoard.MIN_INDEX || y > SudokuBoard.MAX_INDEX || y < SudokuBoard.MIN_INDEX) {
//                throw new IllegalStateException("x and y should be in range " + SudokuBoard.MIN_INDEX + " and " + SudokuBoard.MAX_INDEX);
//            }
//            if (sudokuBoard.getValue(x, y) == null) {
////                sudokuBoard.setValue(SudokuElement.setFieldValue(fieldValue), x, y);
//                System.out.println("Error");
//            } else throw new IllegalStateException("Position " + x + " , " + y + "is already occupied");
//            return this;
//        }
//
//        public SudokuGame build() {
//            for (int x = SudokuBoard.MIN_INDEX; x <= SudokuBoard.MAX_INDEX; x++){
//                for (int y = SudokuBoard.MIN_INDEX; y <= SudokuBoard.MAX_INDEX; y++) {
//                    SudokuRow sudokuRow = sudokuBoard.getValue(x, y);
//                }
//            }
//            return new SudokuGame(sudokuBoard);
//        }
//    }
//}
