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
    static String playAgain;
    static int wins;
    static int loses;


    public static void main(String[] args) {

        startGame();

    }


    public static void startGame() {

        selectDifficulty();

//        System.out.println("Player 1: Enter a word");

//        player1Word = sc.next().toLowerCase();

        player1WordArr.removeAll(player1WordArr);
        player2WordArr.removeAll(player2WordArr);

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

        sc.nextLine();

        player2Guess();

    }

    public static void selectDifficulty() {

        System.out.println("--------- Hangman ----------");
        System.out.println("|       |          |       |");
        System.out.println("| Easy  |  Medium  |  Hard |");
        System.out.println("----------------------------");

        System.out.print("Enter a difficulty: ");

        difficultyOptions();

    }

    public static void difficultyOptions() {

        difficulty = sc.next().toLowerCase();

        if (difficulty.equals("easy")) {

            numberOfGuesses = 15;

            String[] easyWords = {"arms", "back", "ears", "eyes", "face", "feet", "fingers", "foot", "hair", "hands", "head", "knees", "legs", "mouth", "neck", "nose", "shoulders", "skin", "stomach", "teeth", "thumbs", "toes", "tongue", "tooth", "black", "blue", "brown", "gray", "green", "orange", "pink", "purple", "red", "white", "yellow", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

            easyWord = easyWords[(int) (Math.random() * easyWords.length)];

            player1Word = easyWord;

        } else if (difficulty.equals("medium")) {

            numberOfGuesses = 12;

            String[] mediumWords = {"close", "click", "copy", "cut", "command", "database", "delete", "digital", "file", "find", "font", "format", "graphic", "icon", "hardware", "input", "interactive", "Internet", "keyboard", "help", "memory", "menu", "modem", "mouse", "multimedia", "network", "numeric", "open", "output", "paste", "peripheral", "printer", "processing", "replace", "save", "scanner", "search", "select", "software", "text", "advantage", "advertisement", "advice", "agenda", "apology", "authorization", "bill", "brand", "budget", "commission", "comparison", "competition", "competitor", "confirmation", "costs", "creditor", "customer", "deadline", "debt", "debtor", "decision", "decrease", "deficit", "delivery", "department", "description", "difference", "disadvantage", "distribution", "employee", "employer", "enquiry", "environment", "equipment", "estimate", "experience", "explanation", "facilities", "factory", "feedback", "goal", "goods", "growth", "guarantee", "improvement", "increase", "industry", "instructions", "interest", "inventory", "invoice", "knowledge", "limit", "loss", "margin", "market", "message", "mistake", "objective", "offer", "opinion", "option", "order", "output", "payment", "penalty", "permission", "possibility", "product", "production", "profit", "promotion", "purchase", "reduction", "refund", "reminder", "repairs", "report", "responsibility", "result", "retailer", "rise", "risk", "salary", "sales", "schedule", "share", "signature", "stock", "success", "suggestion", "supply", "support", "target", "transport", "turnover", "wholesaler"};

            mediumWord = mediumWords[(int) (Math.random() * mediumWords.length)];

            player1Word = mediumWord;

        } else if (difficulty.equals("hard")) {

            numberOfGuesses = 9;

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

        if (player2Guess.equals(player1Word) || player1WordArr.equals(player2WordArr)) {

            wins += 1;

            System.out.println("YOU WIN!");

            askToPlayAgain();

        } else if (player1Word.contains(player2Guess)) {

            for (int i = 0; i < player1Word.length(); i += 1) {

                if (player1WordArr.get(i).equals(player2Guess)) {

                    String letter = player1WordArr.get(i);

                    player2WordArr.set(i, letter);

                }

            }

            if (player1WordArr.equals(player2WordArr)) {

                checkPlayer2Guess();

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

        switch (numberOfGuesses) {

            case 0:
                hangman0();
                break;
            case 1:
                hangman1();
                break;
            case 2:
                hangman2();
                break;
            case 3:
                hangman3();
                break;
            case 4:
                hangman4();
                break;
            case 5:
                hangman5();
                break;
            case 6:
                hangman6();
                break;
            case 7:
                hangman7();
                break;
            case 8:
                hangman8();
                break;
            case 9:
                hangman9();
                break;

        }

        if (numberOfGuesses == 0) {

            loses += 1;

            System.out.println("You have run out of guesses");
            System.out.println("YOU LOSE");

            askToPlayAgain();

        }

        if (numberOfGuesses <= 0 && playAgain.equals("n")) {

            return;

        } else {

            System.out.println("You have " + numberOfGuesses + " guesses left");

            player2Guess();

        }

    }

    public static void askToPlayAgain() {

        System.out.print("Do you want to play again? [y/n]: ");

        playAgain = sc.next().toLowerCase();

        if (playAgain.equals("y")) {

            startGame();

        } else if (playAgain.equals("n")){

            endGame();

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

    public static void endGame() {

        System.out.println("You lost " + loses + " game(s)");
        System.out.println("You won " + wins + " game(s)");

    }

    public static void hangman0() {

        System.out.println("  ==========     ");
        System.out.println("  ==       !     ");
        System.out.println("  ==      ( )    ");
        System.out.println("  ==       |     ");
        System.out.println("  ==     / | \\  ");
        System.out.println("  ==       ^     ");
        System.out.println("  ==      / \\  ");
        System.out.println("  ==     /   \\ ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman1() {

        System.out.println("  ==========     ");
        System.out.println("  ==       !     ");
        System.out.println("  ==      ( )    ");
        System.out.println("  ==       |     ");
        System.out.println("  ==     / | \\  ");
        System.out.println("  ==       ^     ");
        System.out.println("  ==      /      ");
        System.out.println("  ==     /       ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman2() {

        System.out.println("  ==========     ");
        System.out.println("  ==       !     ");
        System.out.println("  ==      ( )    ");
        System.out.println("  ==       |     ");
        System.out.println("  ==     / | \\  ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman3() {

        System.out.println("  ==========     ");
        System.out.println("  ==       !     ");
        System.out.println("  ==      ( )    ");
        System.out.println("  ==       |     ");
        System.out.println("  ==     / |     ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman4() {

        System.out.println("  ==========     ");
        System.out.println("  ==       !     ");
        System.out.println("  ==      ( )    ");
        System.out.println("  ==       |     ");
        System.out.println("  ==       |     ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman5() {

        System.out.println("  ==========     ");
        System.out.println("  ==       !     ");
        System.out.println("  ==      ( )    ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman6() {

        System.out.println("  ==========     ");
        System.out.println("  ==       !     ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman7() {

        System.out.println("  ==========     ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman8() {

        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("  ==             ");
        System.out.println("=================");

    }

    public static void hangman9() {

        System.out.println("                 ");
        System.out.println("                 ");
        System.out.println("                 ");
        System.out.println("                 ");
        System.out.println("                 ");
        System.out.println("                 ");
        System.out.println("                 ");
        System.out.println("                 ");
        System.out.println("                 ");
        System.out.println("=================");

    }

}