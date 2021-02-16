package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask8 {
    private int variableForFunction;
    @Before
    public void setUpCalculateFunction(){
        variableForFunction = 5;
    }
    @Test
    public void calculateFunction(){
        double result;
        if (variableForFunction >= 3) {
            result = (-Math.pow(variableForFunction, 2)) + (3 * variableForFunction) + 9;
        } else  result = 1 / (Math.pow(variableForFunction, 3) - 6);
        Assert.assertEquals(5, variableForFunction);
        Assert.assertEquals(-1, result, 0.0);
    }
}
