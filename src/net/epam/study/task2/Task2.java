package net.epam.study.task2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task2 {
    public static void main(String[] args) {

    }
    public static int daysInMonth(int year, int month) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static boolean isYearLip(int year) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
