package A11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write a number please..");
        Scanner in = new Scanner(System.in);
        int theNumber = in.nextInt();

        int secondNumber = theNumber + theNumber*10;
        int thirdNumber = secondNumber + theNumber*100;
        int sum = theNumber + secondNumber + thirdNumber;
        System.out.println("Value of " + theNumber + " + " + secondNumber + " + " + thirdNumber + " is " + sum);
    }
}
