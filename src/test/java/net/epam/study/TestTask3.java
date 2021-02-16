package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask3 {
    private int inscribeArea;
    private double describeArea;

    @Before
    public void setUpCalculateArea(){
        inscribeArea = 64;
        double side = Math.sqrt(inscribeArea);
        double radius = side / 2;
        describeArea = (2 * Math.pow(radius, 2));
    }
    @Test
    public void howManyTimesLessArea(){
        Assert.assertEquals(2, (inscribeArea / describeArea), 0.0);
    }
}
