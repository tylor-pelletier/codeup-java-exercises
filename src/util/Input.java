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

    public int getInt() {

        return sc.nextInt();

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

    public double getDouble() {

        return sc.nextDouble();

    }

}