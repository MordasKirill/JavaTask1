package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask7 {
    private int x1, y1, x2, y2;
    @Before
    public void setUpClosestPoint(){
        x1 = 2;
        y1 = 4;
        x2 = 6;
        y2 = 8;
    }
    @Test
    public void calculateClosestPoint(){
        double firstDistance = Math.sqrt((x1 * x1) + (y1 * y1));
        double secondDistance = Math.sqrt((x2 * x2) + (y2 * y2));
        Assert.assertTrue(firstDistance<secondDistance);
    }
}
