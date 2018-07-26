import java.util.Scanner;

public class MethodsExercises {
    static Scanner sc = new Scanner(System.in);

    static int userInput;
    static int sidesOfDice;

    public static void main(String[] args) {

        System.out.println(add(3, 2));
        System.out.println(subtract(10, 5));
        System.out.println(multiply(5, 2));
        System.out.println(divide(10, 5));
        System.out.println(modulus(8, 3));

        System.out.print("Enter a number between 1 and 10: ");
        userInput = sc.nextInt();
        getInteger(1, 10, userInput);

        System.out.print("How many sides do you want your dice to be? [Enter a number]: ");
        sidesOfDice = sc.nextInt();
        rollDice();

    }

//    1

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }
    public static int divide(int number1, int number2) {
        return number1 / number2;
    }
    public static int modulus(int number1, int number2) {
        return number1 % number2;
    }

//    2 & 3

    public static void getInteger(int min, int max, int userInput) {

        int factorial = 1;

        if (userInput >= min && userInput <= max) {

            System.out.println(userInput + " is a valid number");

            for (int i = 1;i <= userInput;i += 1){
                factorial *= i;

            }

            System.out.println("The factorial of " + userInput + " = " + factorial);
            System.out.print("Do you want to continue? [y/n]: ");

            String yesOrNo = sc.next();
            boolean yes = yesOrNo.equals("y");
            boolean no = yesOrNo.equals("n");

            if (yes) {
                System.out.print("Enter a number between 1 and 10: ");
                userInput = sc.nextInt();
                getInteger(1, 10, userInput);
                return;

            } else if (no) {
                return;

            } else {
                System.out.println("Invalid input, try again");

            }

        } else {
            System.out.println("Invalid input, try again");
            System.out.print("Enter a number between 1 and 10: ");
            userInput = sc.nextInt();

        }

        getInteger(1, 10, userInput);

    }

//    4

    public static void rollDice() {

        System.out.print("Roll the dice [Enter: roll]: ");

        String roll = sc.next();

        int j = 0;
        for (int i = 0; i <= j; i += 1) {

            if (roll.equals("roll")) {
                int firstDice = (int)(Math.random()*(sidesOfDice - 1)) + 1;
                System.out.println("The first  dice landed on: " + firstDice);
                int secondDice = (int)(Math.random()*(sidesOfDice - 1)) + 1;
                System.out.println("The second dice landed on: " + secondDice);
                System.out.print("Do you want to roll again? [y/n]: ");
                String rollAgain = sc.next();
                if (rollAgain.equals("y")) {
                    j += 1;
                } else if (rollAgain.equals("n")) {
                    return;
                } else {
                    System.out.println("Invalid input, try again");
                }

            } else {
                System.out.println("Invalid input, try again");
                rollDice();

            }

        }

    }


////////////////////////////////////////////      NOTES

//    public static void main(String[] args) {
//
//        System.out.println(addOne(0));
//        System.out.println(isOne(1));
//        System.out.println(isOne(3));
//        System.out.println(shout("get over here"));
//
//        sayHello("Tylor");
//
//        sayHello(2);
//        sayHello("Tylor");
//        sayHello("Goodbye", "Tylor");
//
//        System.out.println(isOne("1"));
//        System.out.println(isOne("3"));
//
//        int difference = add(6, 3) / subtract(4, 1);
//        System.out.println(difference);
//
//        count();
//        count(5);
//
//    }
//
////    If your main is static, the methods need to be static
////    It cares about what you return. If it isn't returning what is placed after public, it won't work
//    public static boolean isOne(int number) {
//        return number == 1;
//    }
//    public static int addOne(int number) {
//        return number += 1;
//    }
//    public static String shout(String message) {
//        return message.toUpperCase();
//    }
//
////    Void doesn't care what you return
//    public static void sayHello(String name) {
//        System.out.println("Hello, " + name + "!");
//    }
//
////    Overloading
//    public static void sayHello(int times) {
//        for (int i = 0; i < times; i += 1) {
//            sayHello();
//        }
//    }
//    public static void sayHello() {
//        System.out.println("Hello, World!");
//    }
//    public static void sayHello(String greeting, String name) {
//        System.out.println(greeting + " " + name);
//    }
//
//    public static boolean isOne(String stringNumber) {
//        return stringNumber.equals("1");
//    }
//
////    You can put method return values in variables
//    public static int add(int number1, int number2) {
//        return number1 + number2;
//    }
//    public static int subtract(int number3, int number4) {
//        return number3 - number4;
//    }
//
////    For Loop
//    public static void count() {
//        for (int i = 5; i > 0; i -= 1) {
//            System.out.println(i);
//        }
//    }
////    Recusion
//    public static void count(int n) {
//        if(n <= 0) {
//            System.out.println("Finished");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }

}