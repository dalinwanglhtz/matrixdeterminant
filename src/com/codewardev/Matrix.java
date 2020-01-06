package com.codewardev;

// https://www.codewars.com/kata/matrix-determinant/train/java

public class Matrix {

	public static int determinant(int[][] matrix) {
		if(matrix.length == 1) return matrix[0][0];
		
		int dm = 0;
		for(int i=0; i<matrix[0].length; i++) {
			dm += (i%2 == 0? 1 : -1)*matrix[0][i]*determinant(getJuniorMatrix(i, matrix));
		}

		return dm;
	}

	private static int[][] getJuniorMatrix(int i, int[][] matrix) {
		if(matrix.length < 2) return null;
		
		int[][] junior = new int[matrix.length-1][matrix.length-1];
		int index = 0;
		for(int j=1; j<matrix.length; j++) {
			for(int k=0; k<matrix.length; k++) {
				if(k!=i) junior[j-1][index++] = matrix[j][k];
			}
			index=0;
		}
		
		return junior;
	}

}
