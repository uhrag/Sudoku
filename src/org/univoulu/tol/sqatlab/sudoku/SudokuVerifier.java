package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		// returns -1 if the string has other than positive digits in string.
		
		for(char c: candidateSolution.toCharArray()){
			if(!Character.isDigit(c) || c == '-') {
				return -1;
			}
			
			if(candidateSolution != null){
				System.out.println("Jeeeeeee!");
			}
		}
		
		return 0;
	}

}
