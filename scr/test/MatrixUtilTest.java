import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class MatrixUtilTest {
    @Test
    public void testCalculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double expectedAverage = 3.0;
        double actualAverage = Matrix.averageArrayElements(array);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void testIsSquareMatrix() {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        assertTrue(Matrix.isSquareMatrix(squareMatrix));
        assertFalse(Matrix.isSquareMatrix(nonSquareMatrix));
    }
}
