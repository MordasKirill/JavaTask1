package net.study.epam.task1;


public class Task1 {
    public static void main(String[] args) {
        //Task 1;

    }
    public static int calculateLastDigit(int inputNumber) {
        int lastDigit = inputNumber % 10;
        int result;
        switch (lastDigit) {
            case 1:
            case 9:
                result = 1;
                break;
            case 2:
            case 8:
                result = 4;
                break;
            case 3:
            case 7:
                result = 9;
                break;
            case 4:
            case 6:
                result = 6;
                break;
            case 5:
                result = 5;
                break;
            case 0:
                result = 0;
                break;
            default:
                throw new RuntimeException("Something wrong");
        }
        return result;
    }
}
