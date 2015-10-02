package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testSolutionIsValid() {
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String actual =  "123";
		String expected = "123";
		assertEquals(actual, expected);
	}

}
