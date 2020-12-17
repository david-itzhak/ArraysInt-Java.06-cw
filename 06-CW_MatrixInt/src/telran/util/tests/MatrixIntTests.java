package telran.util.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.MatrixInt.*;

import org.junit.jupiter.api.Test;

class MatrixIntTests {

	@Test
	void testAddColumn() {
		int [][] matrix = {{10,20},{7,5}};
		int expMatrix [][] = {{10, 20, 30},{7, 5, 3}};
		int columnElement[] = {30, 3};
		assertArrayEquals(expMatrix, addColumn(matrix, 2, columnElement));
	}
	
	@Test
	void testAddColumn2() {
		int [][] matrix = {{10,20},{7,5}};
		int expMatrix [][] = {{10, 30, 20},{7, 3, 5}};
		int columnElement[] = {30, 3};
		assertArrayEquals(expMatrix, addColumn(matrix, 1, columnElement));
	}
	
	@Test
	void testAddColumn3() {
		int [][] matrix = {{10,20},{7,5}};
		int expMatrix [][] = {{30, 10, 20},{3, 7, 5}};
		int columnElement[] = {30, 3};
		assertArrayEquals(expMatrix, addColumn(matrix, 0, columnElement));
	}
	
	@Test
	void testAddColumn4() {
		int [][] matrix = {{10,20},{7,5}};
		int columnElement[] = {30, 3, 5};
		assertArrayEquals(null, addColumn(matrix, 0, columnElement));
	}
	
	@Test
	void testAddColumn5() {
		int [][] matrix = {{10,20},{7,5}};
		int columnElement[] = {30, 3};
		assertArrayEquals(matrix, addColumn(matrix, 3, columnElement));
	}
	
	
	
	@Test
	void testAddRow() {
		int [][] matrix = {{10,20},{7,5}};
		int expMatrix [][] = {{10, 20},{7, 5}, {30, 3}};
		int rowElements[] = {30, 3};
		assertArrayEquals(expMatrix, addRow(matrix, 2, rowElements));
	}
	
	@Test
	void testAddRow2() {
		int [][] matrix = {{10,20},{7,5}};
		int expMatrix [][] = {{10, 20}, {30, 3}, {7, 5}};
		int rowElements[] = {30, 3};
		assertArrayEquals(expMatrix, addRow(matrix, 1, rowElements));
	}
	
	@Test
	void testAddRow3() {
		int [][] matrix = {{10,20},{7,5}};
		int expMatrix [][] = {{30, 3}, {10, 20}, {7, 5}};
		int rowElements[] = {30, 3};
		assertArrayEquals(expMatrix, addRow(matrix, 0, rowElements));
	}
	
	@Test
	void testAddRow4() {
		int [][] matrix = {{10,20},{7,5}};
		int rowElements[] = {30, 3, 5};
		assertArrayEquals(null, addRow(matrix, 0, rowElements));
	}
	
	@Test
	void testAddRow5() {
		int [][] matrix = {{10,20},{7,5}};
		int rowElements[] = {30, 3};
		assertArrayEquals(matrix, addRow(matrix, 10, rowElements));
	}

	@Test
	void testRemoveRow1() {
		int [][] matrix = {{10, 20}, {7, 5}, {30, 3}};;
		int expMatrix [][] = {{10, 20}, {7, 5}};
		assertArrayEquals(expMatrix, removeRow(matrix, 2));
	}
	
	@Test
	void testRemoveRow2() {
		int [][] matrix = {{10, 20}, {7, 5}, {30, 3}};
		int expMatrix [][] = {{10, 20}, {30, 3}};
		assertArrayEquals(expMatrix, removeRow(matrix, 1));
	}
	
	@Test
	void testRemoveRow3() {
		int [][] matrix = {{10, 20}, {7, 5}, {30, 3}};
		int expMatrix [][] = {{7, 5}, {30, 3}};
		assertArrayEquals(expMatrix, removeRow(matrix, 0));
	}
	
	@Test
	void testRemoveRow4() {
		int [][] matrix = {{10, 20}, {7, 5}, {30, 3}};
		assertArrayEquals(matrix, removeRow(matrix, 3));
	}

}
