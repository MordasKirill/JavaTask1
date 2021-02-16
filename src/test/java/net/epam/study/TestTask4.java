package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask4 {
    private int firstVariable;
    private int secondVariable;
    private int thirdVariable;
    private int forthVariable;

    @Before
    public void setUpEvenNumbers(){
        firstVariable = 16;
        secondVariable = 18;
        thirdVariable = 21;
        forthVariable = 23;
    }
    @Test
    public void evenNumbers(){
        int counter = 0;
        if (firstVariable % 2 == 0) {
            counter++;
        }
        if (secondVariable % 2 == 0) {
            counter++;
        }
        if (thirdVariable % 2 == 0) {
            counter++;
        }

        if (forthVariable % 2 == 0) {
            counter++;
        }
        Assert.assertEquals(2, counter);
    }
}
