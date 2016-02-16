import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lucky on 2/16/16.
 */
public class CalculatorTest {


    @Test
    public void addTest(){
        int variable1 = 3;
        int variable2 = 4;
        int expected = variable1+variable2;
        int actual = Calculator.add(variable1,variable2);

        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest(){
        int variable1 = 3;
        int variable2 = 4;
        int expected = variable1-variable2;
        int actual = Calculator.subtract(variable1,variable2);

        assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest(){
        int variable1 = 3;
        int variable2 = 4;
        int expected = variable1*variable2;
        int actual = Calculator.multiply(variable1,variable2);

        assertEquals(expected, actual);
    }

    @Test
    public void divideTest(){
        int variable1 = 3;
        int variable2 = 4;
        int expected = variable1/variable2;
        int actual = Calculator.divide(variable1,variable2);

        assertEquals(expected, actual);

    }

    @Test(expected = DivisionByZeroException.class)
    public void divideException(){
        int variable1 = 3;
        int variable2 = 0;

        int actual = Calculator.divide(variable1,variable2);


    }

    @Test
    public void SquareRootTest(){
        int inputThree = 3;
        int inputZero = 0;

        double expected1 = Math.sqrt(inputThree);
        double expected2 = Math.sqrt(inputZero);

        double actual1 = Calculator.squareRoot(inputThree);
        double actual2 = Calculator.squareRoot(inputZero);
        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);

    }

    @Test(expected = ComplexNumberException.class)
    public void SquareRootExceptionTest(){
        int negativeNumber = -1;
        
        Calculator.squareRoot(negativeNumber);

    }
}
