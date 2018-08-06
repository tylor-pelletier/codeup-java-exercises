package util;

import java.util.Scanner;

public class Input {

    private static Scanner sc = new Scanner(System.in);

    public String getString() {

        return sc.nextLine();

    }

    public boolean yesNo() {

        System.out.println("[yes/no]");

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

        System.out.println("Enter a number between " + min + " and " + max);

        int input = sc.nextInt();

        if (input > min && input < max) {

            return input;

        } else {

            System.out.println("Invalid input, try again");
            return getInt(min, max);

        }

    }

    public int getInt(String prompt) {

        System.out.println(prompt);
        String input = sc.nextLine();

        try {

            return Integer.valueOf(input);

        } catch (NumberFormatException e) {

            System.out.println("Input was not a valid number, try again");
            return getInt(prompt);

        }

    }

    public double getDouble(double min, double max) {

        System.out.println("Enter a decimal between " + min + " and " + max);

        double input = sc.nextDouble();

        if (input > min && input < max) {

            return input;

        } else {

            System.out.println("Invalid input, try again");
            return getDouble(min, max);

        }

    }

    public double getDouble(String prompt) {

        System.out.println(prompt);
        String input = sc.next();

        try {

            return Double.valueOf(input);

        } catch (NumberFormatException e) {

            System.out.println("Input was not a decimal number, try again");
            return getDouble(prompt);

        }

    }

}