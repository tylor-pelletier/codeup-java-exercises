package util;

import java.util.Scanner;

public class Input {

    private static Scanner sc = new Scanner(System.in);

    public String getString(String prompt) {

        System.out.println(prompt);
        return sc.nextLine();

    }

    public boolean yesNo() {

        System.out.println("Enter yes or no: ");

        String input = sc.next();

        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("confirm")) {

            return true;

        } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no") || input.equalsIgnoreCase("deny")) {

            return false;

        } else {

            System.out.println("Invalid input, try again");
            return yesNo();

        }

    }

    public int getInt(int min, int max) {

        System.out.println("Enter a number between " + min + " and " + max + ": ");

        int input = sc.nextInt();

        if (input > min && input < max) {

            return input;

        } else {

            System.out.println("Input was not a number between " + min + " and " + max + ", try again");
            return getInt(min, max);

        }

    }

    public int getInt() {

        String input = this.getString("Enter a number: ");
        int number = 0;

        try {

            number = Integer.valueOf(input);

        } catch (NumberFormatException e) {

            System.out.println("Input was not a valid number, try again");
            number = getInt();

        }

        return number;

    }

    public double getDouble(double min, double max) {

        System.out.println("Enter a decimal between " + min + " and " + max + ": ");

        double input = sc.nextDouble();

        if (input > min && input < max) {

            return input;

        } else {

            System.out.println("Input was not a decimal number between " + min + " and " + max + ", try again");
            return getDouble(min, max);

        }

    }

    public double getDouble() {

        String input = this.getString("Enter a decimal number: ");
        double decimalNumber = 0;

        try {

            decimalNumber = Double.valueOf(input);

        } catch (NumberFormatException e) {

            System.out.println("Input was not a decimal number, try again");
            decimalNumber = getDouble();

        }

        return decimalNumber;

    }

}