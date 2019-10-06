package com.kodilla.sudoku;

import org.junit.Test;

public class SudokuTestSuite {
    @Test
    public void testBoardBuilder() {
        //Given
        SudokuGame sudokuGame = new SudokuGame.SudokuBuilder().build();
        System.out.println(sudokuGame.getBoard());

        //When
//        SudokuElement sudokuElemnent1 = sudokuGame.getBoard().setValue(, 1, 1);
//        SudokuElement sudokuelemnent2 = sudokuGame.getBoard().setValue(5, 1, 1);
//        SudokuElement sudokuElemnent3= sudokuGame.getBoard().setValue(3, 1, 1);
//        SudokuElement sudokuElemnent4 = sudokuGame.getBoard().setValue(6, 1, 1);
//        SudokuElement sudokuElemnent5 = sudokuGame.getBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent6 = sudokuGame.getBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent7 = sudokuGame.getBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent8 = sudokuGame.getBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent9 = sudokuGame.getBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent10 = sudokuGame.getBoard().setValue(8, 1, 1);
//        SudokuElement sudokuElemnent11 = sudokuGame.getBoard().setValue(8, 1, 1);
//        SudokuElement sudokueElemnen12 = sudokuGame.getBoard().setValue(8, 1, 1);


        //Then

    }

    @Test
    public void testSudokuResolve() {

    }
}
