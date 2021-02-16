package test.java.net.epam.study;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestTask2 {
    private int year = 2020;

    @Test
    public void isYearLip(){
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        Assert.assertTrue(calendar.getActualMaximum(Calendar.DAY_OF_YEAR)>365);
    }
}
