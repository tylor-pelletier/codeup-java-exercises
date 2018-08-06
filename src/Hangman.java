import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

    static Scanner sc = new Scanner(System.in);

    private String category;
    private String computer;
    private String fruitAndVegetables;
    private String transportationAndPlaces;
    private String carParts;
    private String animals;
    private String player1Word;
    private String player2Guess;
    private int numberOfGuesses;
    private ArrayList<String> player2WordArr = new ArrayList<String>();
    private ArrayList<String> player1WordArr = new ArrayList<String>();
    private ArrayList<String> guesses = new ArrayList<>();
    private String playAgain;
    private int wins;
    private int loses;
    private int end = 0;

    public void main(String[] args) {

        startGame();

    }

    public void startGame() {

        selectDifficulty();

//        System.out.println("Player 1: Enter a word");

//        player1Word = sc.next().toLowerCase();

        player1WordArr.removeAll(player1WordArr);
        player2WordArr.removeAll(player2WordArr);
        guesses.clear();

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

    public void selectDifficulty() {

        System.out.println("--------- Hangman ----------");
        System.out.println("1 - Computer");
        System.out.println("2 - Fruits & Vegetables");
        System.out.println("3 - Tranportation & Places");
        System.out.println("4 - Car parts");
        System.out.println("5 - Animals");

        System.out.print("Enter a category number: ");

        difficultyOptions();

    }

    public void difficultyOptions() {

        category = sc.next().toLowerCase();

        if (category.equals("1")) {

            numberOfGuesses = 10;

            String[] easyWords = {"close", "click", "copy", "cut", "command", "database", "delete", "digital", "file", "find", "font", "format", "graphic", "icon", "hardware", "input", "interactive", "Internet", "keyboard", "help", "memory", "menu", "modem", "mouse", "multimedia", "network", "numeric", "open", "output", "paste", "peripheral", "printer", "processing", "replace", "save", "scanner", "search", "select", "software", "text"};

            computer = easyWords[(int) (Math.random() * easyWords.length)];

            player1Word = computer;

        } else if (category.equals("2")) {

            numberOfGuesses = 10;

            String[] mediumWords = {"apple", "banana", "cherry", "grapefruit", "grapes", "lemon", "lime", "melon", "orange", "peach", "pear", "persimmon", "pineapple", "plum", "strawberry", "tangerine", "watermelon", "asparagus", "beans", "broccoli", "cabbage", "carrot", "celery", "corn", "cucumber", "eggplant", "green pepper", "lettuce", "onion", "peas", "potato", "pumpkin", "radish", "spinach", "sweet potato", "tomato", "turnip"};

            fruitAndVegetables = mediumWords[(int) (Math.random() * mediumWords.length)];

            player1Word = fruitAndVegetables;

        } else if (category.equals("3")) {

            numberOfGuesses = 10;

            String[] hardWords = {"airplane", "bicycle", "boat", "bus", "car", "helicopter", "horse", "jet", "motorcycle", "ship", "subway", "taxi", "train", "truck", "airport", "apartment", "building", "bank", "church", "hospital", "house", "library", "museum", "restaurant", "school", "mall", "supermarket"};

            transportationAndPlaces = hardWords[(int) (Math.random() * hardWords.length)];

            player1Word = transportationAndPlaces;

        } else if (category.equals("4")) {

            numberOfGuesses = 10;

            String[] hardWords = {"accelerator", "battery", "blinker", "brake", "bumper", "clutch", "dashboard", "gear", "headlight", "horn", "hubcap", "seat", "speedometer", "taillight", "tire", "trunk", "turn signal", "wheel", "windshield"};

            carParts = hardWords[(int) (Math.random() * hardWords.length)];

            player1Word = carParts;

        } else if (category.equals("5")) {

            numberOfGuesses = 10;

            String[] hardWords = {"alligator", "ant", "bear", "bee", "bird", "camel", "cat", "cheetah", "chicken", "chimpanzee", "cow", "crocodile", "deer", "dog", "dolphin", "duck", "eagle", "elephant", "fish", "fly", "fox", "frog", "giraffe", "goat", "goldfish", "hamster", "hippopotamus", "horse", "kangaroo", "kitten", "lion", "lobster", "monkey", "octopus", "owl", "panda", "pig", "puppy", "rabbit", "rat", "scorpion", "seal", "shark", "sheep", "snail", "snake", "spider", "squirrel", "tiger", "turtle", "wolf", "zebra"};

            animals = hardWords[(int) (Math.random() * hardWords.length)];

            player1Word = animals;

        } else {

            System.out.println("Invalid input, try again");

            difficultyOptions();

        }

    }

    public void player2Guess() {

        player2Guess = sc.nextLine().toLowerCase();

        if (guesses.contains(player2Guess)) {

            System.out.println("You already entered that letter");

            player2Guess();

        } else if (player2Guess.matches("[a-z]{1}") || player2Guess.equals(player1Word) ) {

            guesses.add(player2Guess);

            checkPlayer2Guess();

        } else {

            System.out.println("Invalid input, try again");

            player2Guess();

        }

    }

    public void checkPlayer2Guess() {

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

            if (player1WordArr.equals(player2WordArr) && playAgain.equals("n") || numberOfGuesses <= 0 &&  playAgain.equals("n")) {

                endGame();

            } else {

                convertArrToStr();

                player2Guess();

            }

        } else if (!player1Word.contains(player2Guess)) {

            System.out.println(player2Guess + " is not in the word");

            convertArrToStr();

            minusAGuess();

        }

    }

    public void minusAGuess() {

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

    public void askToPlayAgain() {

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

    public void convertArrToStr() {

        for (String p2WordArr : player2WordArr) {

            String[] guess = p2WordArr.split(", ");

            for (String player2WordStr : guess) {

                System.out.print(player2WordStr);

            }

        }

        System.out.println(" ");

    }

    public void endGame() {

        switch (end) {
            case 0:
                System.out.println("You lost " + loses + " game(s)");
                System.out.println("You won " + wins + " game(s)");
                break;
            case 1:
                break;
            default:
                break;

        }

        end += 1;

    }

    public void hangman0() {

        System.out.println("  ==========     ");
        System.out.println("  ==       !     ");
        System.out.println("  ==      ( )    ");
        System.out.println("  ==       |     ");
        System.out.println("  ==     / | \\  ");
        System.out.println("  ==       ^     ");
        System.out.println("  ==      / \\   ");
        System.out.println("  ==     /   \\  ");
        System.out.println("  ==             ");
        System.out.println("=================");
        System.out.println("     HANGMAN     ");

    }

    public void hangman1() {

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
        System.out.println("     HANGMAN     ");

    }

    public void hangman2() {

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
        System.out.println("     HANGMAN     ");

    }

    public void hangman3() {

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
        System.out.println("     HANGMAN     ");

    }

    public void hangman4() {

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
        System.out.println("     HANGMAN     ");

    }

    public void hangman5() {

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
        System.out.println("     HANGMAN     ");

    }

    public void hangman6() {

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
        System.out.println("     HANGMAN     ");

    }

    public void hangman7() {

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
        System.out.println("     HANGMAN     ");

    }

    public void hangman8() {

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
        System.out.println("     HANGMAN     ");

    }

    public void hangman9() {

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
        System.out.println("     HANGMAN     ");

    }

}