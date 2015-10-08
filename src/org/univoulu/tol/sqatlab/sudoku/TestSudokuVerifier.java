package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testSolutionIsValid() {
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String actual =  "123456789";
		String expected = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		
		assertEquals(actual, expected);
	}
	
	public void testSudokuOnlyPositiveDigitsRule1() {
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String actual =  "123456789";
		String expected = "123456789";
		
		
		assertEquals(actual, expected);
	}
	
	public void testSudokuAllDigitsAppearOnceInSubgridRule2() {
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String actual =  "123456789";
		String expected = "123456789";
		
		
		assertEquals(actual, expected);
	}
	
	public void testSudokuRowsRule3() {
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String actual =  "123456789";
		String expected = "123456789";
		
		
		assertEquals(actual, expected);
	}
	
	public void testSudokuColumnsRule4() {
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String actual =  "123456789";
		String expected = "123456789";
		
		
		assertEquals(actual, expected);
	}
	
	
}
