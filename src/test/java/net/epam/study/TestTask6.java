package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask6 {
    private int second;
    @Before
    public void setUpCountTime(){
        second = 15000;
    }
    @Test
    public void countTime(){
        int hours = second / 3600;
        int minutes = (second - hours * 3600) / 60;
        Assert.assertEquals(4, hours);
        Assert.assertEquals(10, minutes);
    }
}
