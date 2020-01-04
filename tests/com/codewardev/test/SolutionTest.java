package com.codewardev.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.Matrix;

class SolutionTest {

	private static int[][][] matrix = { {{1}},
            {{1, 3}, {2,5}},
            {{2,5,3}, {1,-2,-1}, {1, 3, 4}}};

	private static int[] expected = {1, -1, -20};
	
	private static String[] msg = {"Determinant of a 1 x 1 matrix yields the value of the one element",
	       "Should return 1 * 5 - 3 * 2 == -1 ",
	       ""};
	
	@Test
	public void sampleTests() {
		for (int n = 0 ; n < expected.length ; n++)
		assertEquals(msg[n], expected[n], Matrix.determinant(matrix[n]));
	}

}
