package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask10 {
    private int segmentStart;
    private int segmentEnd;
    private int step;
    @Before
    public void setUpFunctionWithStep(){
        segmentStart = 1;
        segmentEnd = 5;
        step = 1;
    }
    @Test
    public void calculateFunctionWithStep(){
        int variable;
        int result = 0;
        for (variable = segmentStart; variable <= segmentEnd; variable += step) {
            result = (int) Math.round(Math.tan(variable));
        }
        Assert.assertEquals(-3, result, 0.0);
    }
}
