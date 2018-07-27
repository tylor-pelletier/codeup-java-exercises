import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    static Scanner sc = new Scanner(System.in);

    static String player1Word;
    static String player2Guess;
    static int numberOfGuesses = 9;
    static ArrayList<String> player2WordArr = new ArrayList<String>();
    static ArrayList<String> player1WordArr = new ArrayList<String>();


    public static void main(String[] args) {

        startGame();

    }


    public static void startGame() {

        selectDifficulty();

        System.out.println("Player 1: Enter a word");

        player1Word = sc.next().toLowerCase();               // CREATE MULTIPLE DIFFICULTY ARRAYS TO RANDOMLY GET A WORD

        for (int i = 0; i < player1Word.length(); i += 1) {

            player2WordArr.add("-");

        }

        convertArrToStr();

        System.out.println(" ");

        System.out.print("Guess a letter or the word: ");

        String[] p1WordArr = player1Word.split("");

        for (String letters : p1WordArr) {

            player1WordArr.add(letters);

        }

        player2Guess();

    }

    public static void player2Guess() {

        player2Guess = sc.next().toLowerCase();

        if (player2Guess.matches("[a-z]{1}") || player2Guess.equals(player1Word)) {

            checkPlayer2Guess();

        } else {

            System.out.println("Invalid input, try again");

            player2Guess();

        }

    }

    public static void checkPlayer2Guess() {

        if (player2Guess.equals(player1Word)) {

            System.out.println("YOU WIN!");                     // ALLOW WHEN ALL LETTERS ARE FILLED TO BE A WIN AS WELL

            askToPlayAgain();

        } else if (player1Word.contains(player2Guess)) {

            for (int i = 0; i < player1Word.length(); i += 1) {

                if (player1WordArr.get(i).equals(player2Guess)) {

                    String letter = player1WordArr.get(i);

                    player2WordArr.set(i, letter);

                }

            }

            convertArrToStr();

            minusAGuess();

        } else if (!player1Word.contains(player2Guess)) {

            System.out.println(player2Guess + " is not in the word");

            convertArrToStr();

            minusAGuess();

        }

    }

    public static void minusAGuess() {

        numberOfGuesses -= 1;

        if (numberOfGuesses == 0) {

            System.out.println("You have run out of guesses");
            System.out.println("YOU LOSE");

            askToPlayAgain();

        }

        System.out.println("You have " + numberOfGuesses + " guesses left");

        player2Guess();

    }

    public static void askToPlayAgain() {

        System.out.print("Do you want to play again? [y/n]: ");

        String playAgain = sc.next();

        if (playAgain.equalsIgnoreCase("y")) {

            startGame();

        } else if (playAgain.equalsIgnoreCase("n")){

            return;

        } else {

            System.out.println("Invalid input, try again");

            askToPlayAgain();

        }

    }

    public static void convertArrToStr() {

        for (String p2WordArr : player2WordArr) {

            String[] guess = p2WordArr.split(", ");

            for (String player2WordStr : guess) {

                System.out.print(player2WordStr);

            }

        }

        System.out.println(" ");

    }

    public static void selectDifficulty() {

        System.out.println("--------- Hangman ----------");
        System.out.println("|       |          |       |");
        System.out.println("| Easy  |  Medium  |  Hard |");
        System.out.println("----------------------------");

    }

}