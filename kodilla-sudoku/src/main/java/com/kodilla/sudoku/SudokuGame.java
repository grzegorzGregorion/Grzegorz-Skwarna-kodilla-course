package com.kodilla.sudoku;

public class SudokuGame {
    private final Board board;

    SudokuGame(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public static class SudokuBuilder {
        private Board board = new Board();

        public SudokuBuilder SudokuElement(int fieldValue, int x, int y) {
            if (x > Board.MAX_INDEX || x < Board.MIN_INDEX || y > Board.MAX_INDEX || y < Board.MIN_INDEX) {
                throw new IllegalStateException("x and y should be in range " + Board.MIN_INDEX + " and " + Board.MAX_INDEX);
            }
            if (board.getValue(x, y) == null) {
//                board.setValue(SudokuElement.setFieldValue(fieldValue), x, y);
                System.out.println("Error");
            } else throw new IllegalStateException("Position " + x + " , " + y + "is already occupied");
            return this;
        }

        public SudokuGame build() {
            for (int x = Board.MIN_INDEX; x <= Board.MAX_INDEX; x++){
                for (int y = Board.MIN_INDEX; y <= Board.MAX_INDEX; y++) {
                    SudokuElement sudokuElement = board.getValue(x, y);
                }
            }
            return new SudokuGame(board);
        }
    }
}
