package telran.util;
import static telran.util.ArraysInt.*;

public class MatrixInt {
	
	public static int[][] addColumn(int[][] matrix, int nColumn, int [] columnElements) {
		if(columnElements.length == matrix.length) {
			if(nColumn < 0 || nColumn > matrix[0].length) {
				return matrix;
			}
			for(int i = 0; i < columnElements.length; i++) {
				matrix [i] = add(matrix[i], columnElements[i], nColumn);
			}
			return matrix;
		}
		return null;
	}

	public static int[][] addRow(int[][] matrix, int nRow, int [] rowElements) {
		if(rowElements.length == matrix[0].length) {
			if(nRow < 0 || nRow > matrix.length) {
				return matrix;
			}
			int [][] result = new int [matrix.length + 1][];
			System.arraycopy(matrix, 0, result, 0, nRow);
			result[nRow] = rowElements;
			System.arraycopy(matrix, nRow, result, nRow+1, matrix.length-nRow);
			return result;
		}
		return null;

	}
	
	public static int[][] removeColumn(int[][] matrix, int nColumn) {
		// TODO 
		return null;
	}
	 
	public	static	int	[][] removeRow(int [][] matrix,	int	nRow) {
		if(nRow < 0 || nRow >= matrix.length) {
			return matrix;
		}
		int [][] result = new int [matrix.length-1][];
		System.arraycopy(matrix, 0, result, 0, nRow);
		System.arraycopy(matrix, nRow+1, result, nRow, matrix.length-( nRow+1));
		return result;
	}
	
}
