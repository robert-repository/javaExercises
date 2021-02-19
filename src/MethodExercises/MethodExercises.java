package MethodExercises;

public class MethodExercises {
    public static void main(String... args) {


    }

    void sayHelloThrice() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Hello World");
        }
    }

    void sayHelloWorldThrice(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println("Hello World");
        }
    }

    void printNumberToNTimes(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    void printSquareOfNumberToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
    }

    void printSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    int sumOfTwo(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    int sumOfThree(int fNum, int sNum, int tNum) {
        int sum = fNum + sNum + tNum;
        return sum;
    }

    int findThirdAngle(int fAngle, int sAngle) {
        int tAngle = 180 - (fAngle + sAngle);
        return tAngle;
    }

    int calculateAverageOfThree(int fNum, int sNum, int tNum) {
        int average = (fNum + sNum + tNum) / 3;
        return average;
    }


}
