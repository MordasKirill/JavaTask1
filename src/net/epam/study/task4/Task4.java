package net.epam.study.task4;

public class Task4 {
    public static void main(String[] args) {

    }
    public static boolean isTwoNumbersEven(int firstVariable, int secondVariable, int thirdVariable, int forthVariable) {
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
        return counter >= 2;
    }
}
