import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixObject;

    @Before
    public void setUp() throws Exception {
        matrixObject=new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        matrixObject=null;
    }

    @Test
    public void additioHJGHGFGFKn() {
        int[][] firstMatrix={{1,2},{3,4},{5,6}};
        int[][] secondMatrix={{9,8},{7,6},{5,4}};
        String expectedFinal="[[10, 10], [10, 10], [10, 10]]";
       assertEquals(expectedFinal,matrixObject.addition(firstMatrix,secondMatrix,3,2));
    }
    @Test
    public void addition2() {
        int[][] firstMatrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] secondMatrix={{9,8,7},{6,5,4},{3,2,1}};
        String expectedFinal="[[10, 10, 10], [10, 10, 10], [10, 10, 10]]";
        assertEquals(expectedFinal,matrixObject.addition(firstMatrix,secondMatrix,3,3));
    }
}