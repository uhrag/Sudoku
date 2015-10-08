package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		// returns -1 if the string has
		
		for(char c: candidateSolution.toCharArray()){
			if(!Character.isDigit(c) || c == '-') {
				return -1;
			} else {
				return 0;
			}
		}
		
		return 0;
	}

}
