package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	SudokuVerifier sVerify;
	String incorrectSudoku = "a23456789912345678891234567789123456678912345567891234456789123345678912234567891";
	String correctSudoku = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	
	public void init(){
		sVerify = new SudokuVerifier();
	}
	
	@Test
	public void testSudokuOnlyPositiveDigitsRule1() {
		int checked = 0;
		checked =  sVerify.verify(incorrectSudoku);
		
		assertEquals(-1, checked);
	}
	
/*	public void testSudokuAllDigitsAppearOnceInSubgridRule2() {
		String actual =  "123456789";
		String expected = "123456789";
		
		
		assertEquals(actual, expected);
	}
	
	public void testSudokuRowsRule3() {
		String actual =  "123456789";
		String expected = "123456789";
		
		
		assertEquals(actual, expected);
	}
	
	public void testSudokuColumnsRule4() {
		String actual =  "123456789";
		String expected = "123456789";
		
		
		assertEquals(actual, expected);
	}
	*/
	
}
