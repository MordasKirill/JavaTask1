package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask9 {
    private int radius;
    @Before
    public void setUpCalculateRadius(){
        radius = 10;
    }
    @Test
    public void radiusCalculations(){
        double circumference = Math.round(2 * Math.PI * radius);
        double square = Math.round(Math.PI* Math.pow(radius, 2));
        Assert.assertEquals(63, circumference, 0.0);
        Assert.assertEquals(314, square, 0.0);
    }
}
