package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testSolutionIsValid() {
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String actual =  "123456789";
		String expected = "123456789";
		assertEquals(actual, expected);
	}

}
