import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int j = 0;
        for (int i = 0; i <= j; i += 1) {

            System.out.print("Enter something to say to Bob: ");

            String sentence = sc.nextLine();
            int questionMark = sentence.indexOf('?');
            int exclamationMark = sentence.indexOf('!');
            String empty = "";

            if (j == 4) {
                System.out.println("Bob: \'I'm done talking with you.\'");
            } else if (questionMark > -1) {
                System.out.println("Bob: \'Sure.\'");
                j += 1;
            } else if (exclamationMark > -1) {
                System.out.println("Bob: \'Woah, chill out!\' ");
                j += 1;
            } else if (sentence.equals(empty)) {
                System.out.println("Bob: \'Fine! Be that way!\'");
                j += 1;
            } else {
                System.out.println("Bob: \'Whatever.\'");
                j += 1;
            }

        }

    }

}