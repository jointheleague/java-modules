package _03_Intro_to_2D_Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _02_RowColumnSumTest {

    /*
     *  A 2D array is comparable to a matrix ordered by rows and columns.
     *  A 2D array that holds 3, 1D arrays with each 1D array having 3 elements
     *  can be thought of a 3x3 matrix:
     *                 col0 col1 col2
     *                  \/   \/   \/
     *          row 0  { 1,  2,  3 }
     *          row 1  { 4,  5,  6 }
     *          row 2  { 7,  8,  9 }
     *          
     *  Where row 0 contains the numbers 1, 2, 3.
     *  and column 0 contains the numbers 1, 4, 7.
     *  
     *  Java stores a 2D array in 'row-major order', meaning the row number is
     *  the first number in the square brackets. The row 0 elements are:
     *  
     *  Row 0 = matrix[0][0], matrix[0][1], matrix[0][2]    // 1, 2, 3  
     * 
     *  The second number in the square brackets is the column number.
     *  The column 0 elements are:
     *  
     *  Column 0 = matrix[0][0], matrix[1][0], matrix[2][0] // 1, 4, 7
     *  
     *  Your task is to complete the sum methods to calculate the sum of all
     *  the numbers in a specified row or column.
     */
    
    int[][] testMatrix = { { 10, 20, 30 },
                           { 80, -10, 100 },
                           { 75, -25, -50 } };
    
    _02_RowColumnSum methods = new _02_RowColumnSum();
    
    @Test
    void testRowSum() {
        assertEquals(60, methods.getSumByRow(testMatrix, 0) );
        assertEquals(170, methods.getSumByRow(testMatrix, 1) );
        assertEquals(0, methods.getSumByRow(testMatrix, 2) );
    }

    void testColumnSum() {
        assertEquals(165, methods.getSumByColumn(testMatrix, 0) );
        assertEquals(-15, methods.getSumByColumn(testMatrix, 1) );
        assertEquals(80, methods.getSumByColumn(testMatrix, 2) );
    }
}
