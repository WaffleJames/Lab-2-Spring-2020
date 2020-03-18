/*
 * James Hall - Lab 2: Simple Calculator
 * (I took this class last semester as well, but dropped it, so a lot of this code is using a similar method I used then)
 */

import java.util.Scanner;

public class Calculator {
//comment for github: main method below
    public static void main(String[] args) {
        //initializing scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        float first = input.nextFloat();
        System.out.print("Enter second operand: ");
        float second = input.nextFloat();
        System.out.println("\nCalculator Menu" +
                "\n---------------" +
                "\n1. Addition" +
                "\n2. Subtraction" +
                "\n3. Multiplication" +
                "\n4. Division");
        System.out.print("\nWhich operation do you want to perform? ");
        //initializing variables for output and formulas
        int option = input.nextInt();
        float sum = first + second;
        float dif = first - second;
        float mul = first * second;
        float div = first / second;
        //if statements for each individual option
        if (option == 1)
            System.out.printf("The result of the operation is %.1f. Goodbye!", sum);
        else if (option == 2)
            System.out.printf("The result of the operation is %.1f. Goodbye!", dif);
        else if (option == 3)
            System.out.printf("The result of the operation is %.3f. Goodbye!", mul);
        else if (option == 4)
            System.out.printf("The result of the operation is %.1f. Goodbye!", div);
        else
            System.out.print("Error: Invalid selection! Terminating program.");

    }
}