import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    private char currentPlayerMark;
    static String[][] board = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
    };

    public static void main(String[] args) {

        generateBoard();

        player1Turn();

    }

    public static void generateBoard() {


        System.out.println("    1   2   3  ");
        System.out.println("  +---+---+---+");

        String[] abc = {"A", "B", "C"};

        for (int i = 0; i < 3; i++) {

            System.out.print(abc[i] + " | ");

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " | ");

            }

            System.out.println();
            System.out.println("  +---+---+---+");

        }

    }

    public static void player1Turn() {

        System.out.println("Enter the square you want to place your X: ");

        String player1Move = sc.next().toUpperCase();

        switch (player1Move) {

            case "A1":
                board[0][0] = board[0][0].replace("-", "X");

                generateBoard();

        }

    }

}