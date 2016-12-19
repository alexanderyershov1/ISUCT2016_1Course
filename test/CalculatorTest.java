import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 12.12.16.
 */
public class CalculatorTest {
    @Test
    public void equation1() throws Exception {
        Calculator calc = new Calculator();
        double result = calc.equation1(1.25);
        double expResult = 4;
        assertEquals(expResult, result,0.001);
        }
    }