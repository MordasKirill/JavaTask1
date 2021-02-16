package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask5 {
    private int perfectNumber;
    @Before
    public void setUpPerfectNumber(){
        perfectNumber = 8128;
    }
    @Test
    public void perfectNumber(){
        int sum = 0;
        for (int i = 1; i < perfectNumber; i++) {
            if (perfectNumber % i == 0) {
                sum += i;
            }
        }
        Assert.assertEquals(sum, perfectNumber);
    }
}
