import java.util.Scanner;

public class HighLow {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        startGame();

    }

    public static void startGame() {

        int randomNumber = (int)(Math.random()*(100 - 1)) + 1;

        System.out.println(randomNumber);

        int j = 0;
        for (int i = 0; i <= j; i += 1){

            System.out.println("You have " + (10 - i) + " guesses left");

            System.out.print("Guess a number: ");

            int guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("GOOD GUESS! YOU WIN!");
                newGame();

            } else if (j == 10) {
                newGame();

            } else if (guess < randomNumber) {
                System.out.println("HIGHER");
                j += 1;

            } else if (guess > randomNumber) {
                System.out.println("LOWER");
                j += 1;

            } else {
                System.out.println("Invalid input, try again");
                j += 1;

            }

        }

    }

    public static void newGame() {

        int z = 0;
        for (int y = 0; y <= z; y += 1) {
            System.out.print("You are out of guesses, do you want to play again? [y/n]: ");
            String playAgain = sc.next();

            if (playAgain.equals("y")) {
                startGame();

            } else if (playAgain.equals("n")) {
                return;

            } else {
                System.out.println("Invalid input, try again");
                z += 1;

            }

        }

    }

}
