package com.kodilla.sudoku;

import org.junit.Test;

public class SudokuTestSuite {
    @Test
    public void testBoardBuilder() {
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();
        System.out.println(sudokuBoard);

        //When
        sudokuBoard.setElement(3, 5, 7);
        System.out.println(sudokuBoard);
        System.out.println(sudokuBoard.getPossibles(3, 5));
//        SudokuElement sudokuElemnent1 = sudokuBoard.setElement().setElement(new SudokuElement(2), 1, 1);
//        SudokuElement sudokuelemnent2 = sudokuGame.getSudokuBoard().setValue(5, 1, 1);
//        SudokuElement sudokuElemnent3= sudokuGame.getSudokuBoard().setValue(3, 1, 1);
//        SudokuElement sudokuElemnent4 = sudokuGame.getSudokuBoard().setValue(6, 1, 1);
//        SudokuElement sudokuElemnent5 = sudokuGame.getSudokuBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent6 = sudokuGame.getSudokuBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent7 = sudokuGame.getSudokuBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent8 = sudokuGame.getSudokuBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent9 = sudokuGame.getSudokuBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent10 = sudokuGame.getSudokuBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent11 = sudokuGame.getSudokuBoard().setValue(8, 1, 1);
//        SudokuElement sudokueElemnen12 = sudokuGame.getSudokuBoard().setValue(8, 1, 1);


        //Then

    }

    @Test
    public void testSudokuResolve() {

    }
}
