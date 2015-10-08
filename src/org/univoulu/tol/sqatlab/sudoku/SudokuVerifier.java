package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		
		for(char c: candidateSolution.toCharArray()){
			if(!Character.isDigit(c)) {
				return -1;
			}
		}

}
