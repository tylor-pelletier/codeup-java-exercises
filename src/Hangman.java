import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    static Scanner sc = new Scanner(System.in);

    static String difficulty;
    static String easyWord;
    static String mediumWord;
    static String hardWord;
    static String player1Word;
    static String player2Guess;
    static int numberOfGuesses;
    static ArrayList<String> player2WordArr = new ArrayList<String>();
    static ArrayList<String> player1WordArr = new ArrayList<String>();


    public static void main(String[] args) {

        startGame();

    }


    public static void startGame() {

        numberOfGuesses = 9;

        selectDifficulty();

//        System.out.println("Player 1: Enter a word");

//        player1Word = sc.next().toLowerCase();

//        player2WordArr.CLEAR                                                    // CLEAR THE ARRAY TO START A NEW GAME

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

    public static void selectDifficulty() {

        System.out.println("--------- Hangman ----------");
        System.out.println("|       |          |       |");
        System.out.println("| Easy  |  Medium  |  Hard |");
        System.out.println("----------------------------");

        difficultyOptions();

    }

    public static void difficultyOptions() {

        difficulty = sc.nextLine();

        if (difficulty.toLowerCase().equals("easy")) {

            String[] easyWords = {"arm", "back", "ears", "eyes", "face", "feet", "fingers", "foot", "hair", "hands", "head", "knees", "legs", "mouth", "neck", "nose", "shoulders", "skin", "stomach", "teeth", "thumbs", "toes", "tongue", "tooth", "black", "blue", "brown", "gray", "green", "orange", "pink", "purple", "red", "white", "yellow", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

            easyWord = easyWords[(int) (Math.random() * easyWords.length)];

            player1Word = easyWord;

        } else if (difficulty.toLowerCase().equals("medium")) {

            String[] mediumWords = {"close", "click", "copy", "cut", "command", "database", "delete", "digital", "file", "find", "font", "format", "graphic", "icon", "hardware", "input", "interactive", "Internet", "keyboard", "help", "memory", "menu", "modem", "mouse", "multimedia", "network", "numeric", "open", "output", "paste", "peripheral", "printer", "processing", "replace", "save", "scanner", "search", "select", "software", "text", "advantage", "advertisement", "advice", "agenda", "apology", "authorization", "bill", "brand", "budget", "commission", "comparison", "competition", "competitor", "confirmation", "costs", "creditor", "customer", "deadline", "debt", "debtor", "decision", "decrease", "deficit", "delivery", "department", "description", "difference", "disadvantage", "distribution", "employee", "employer", "enquiry", "environment", "equipment", "estimate", "experience", "explanation", "facilities", "factory", "feedback", "goal", "goods", "growth", "guarantee", "improvement", "increase", "industry", "instructions", "interest", "inventory", "invoice", "knowledge", "limit", "loss", "margin", "market", "message", "mistake", "objective", "offer", "opinion", "option", "order", "output", "payment", "penalty", "permission", "possibility", "product", "production", "profit", "promotion", "purchase", "reduction", "refund", "reminder", "repairs", "report", "responsibility", "result", "retailer", "rise", "risk", "salary", "sales", "schedule", "share", "signature", "stock", "success", "suggestion", "supply", "support", "target", "transport", "turnover", "wholesaler"};

            mediumWord = mediumWords[(int) (Math.random() * mediumWords.length)];

            player1Word = mediumWord;

        } else if (difficulty.toLowerCase().equals("hard")) {

            String[] hardWords = {"awkward", "bagpipes", "banjo", "bungler", "croquet", "crypt", "dwarves", "fervid", "fishhook", "fjord", "gazebo", "gypsy", "haiku", "haphazard", "hyphen", "ivory", "jazzy", "jiffy", "jinx", "jukebox", "kayak", "kiosk", "klutz", "labradorite", "memento", "mystify", "numbskull", "ostracize", "oxygen", "pajama", "phlegm", "pixel", "polka", "quad", "quip", "rhythmic", "rogue", "sphinx", "squawk", "swivel", "toady", "twelfth", "unzip", "waxy", "wildebeest", "yacht", "zealous", "zigzag", "zippy", "zombie"};

            hardWord = hardWords[(int) (Math.random() * hardWords.length)];

            player1Word = hardWord;

        } else {

            System.out.println("Invalid input, try again");

            difficultyOptions();

        }

    }

    public static void player2Guess() {

        player2Guess = sc.nextLine().toLowerCase();

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

            player2Guess();

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

}