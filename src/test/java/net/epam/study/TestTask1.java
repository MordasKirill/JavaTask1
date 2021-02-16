package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask1 {
    private int lastDigit;

    @Before
    public void setUpGetLastDigit() {
        int number = (int) (Math.random() * 100);
        lastDigit = number % 10;
    }

    @Test
    public void getLastDigit(){
        int expectedResult;
        int actualResult;
        switch (lastDigit) {
            case 1:
            case 9:
                expectedResult = 1;
                break;
            case 2:
            case 8:
                expectedResult = 4;
                break;
            case 3:
            case 7:
                expectedResult = 9;
                break;
            case 4:
            case 6:
                expectedResult = 6;
                break;
            case 5:
                expectedResult = 5;
                break;
            case 0:
                expectedResult = 0;
                break;
            default:
                throw new RuntimeException("Something wrong");
        }
        actualResult = (int) Math.pow(lastDigit, 2) % 10;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
