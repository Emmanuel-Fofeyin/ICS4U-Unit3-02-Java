/*
* This program calculates the factorial of a number.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-04-24
*/

import java.util.Scanner;

/**
* This is the Main class.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method calculates the factorial of a given integer using recursion.
    *
    * @param someInt the integer whose factorial is to be calculated
    * @return the factorial of the given integer
    */
    public static int factorial(int someInt) {
        int returnValue = 0;
        if (someInt < 0) {
            returnValue = -1;
        } else {
            if (someInt <= 1) {
                returnValue = 1;
            } else {
                returnValue = someInt * factorial(someInt - 1);
            }
        }

        return returnValue;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Entered = ");
        final int someInt = scanner.nextInt();
        final int factorialOfInt = factorial(someInt);
        System.out.println("Returned = " + factorialOfInt);

        System.out.println("\nDone.");
    }
}
