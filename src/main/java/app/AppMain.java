package app;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {
//        Create a new class with a main method that prompts the user for input and does the following (using the StringUtils class)
//
//        1. Tells whether what the user entered is a number
//        2. Flips the case of the string
//        3. Reverses the string
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input = scanner.nextLine();
        System.out.println("Is it a number? " + StringUtils.isNumeric(input));
        System.out.println("Flipped this case: " + StringUtils.swapCase(input));
        System.out.println("Reverse esreveR: " + StringUtils.reverse(input));
    }

        String userInput = "";
        boolean numericInput = StringUtils.isNumeric(userInput);
    }


