import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Ints newCalc = new IntsCalculator();

    @Test
    public void sumTest() {
        int calcSum = newCalc.sum(5, 2);
        int expSum = 7;
        Assertions.assertEquals(expSum, calcSum);
    }

    @Test
    public void multTest() {
        int calcMult = newCalc.mult(3, 5);
        int expMult = 15;
        Assertions.assertEquals(expMult, calcMult);
    }

    @Test
    public void powTest() {
        int calcPow = newCalc.pow(2, 3);
        int expPow = 8;
        Assertions.assertEquals(expPow, calcPow);
    }
}