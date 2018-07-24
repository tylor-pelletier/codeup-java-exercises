import java.util.Scanner; // Can be done by clicking on scanner, hitting (option + enter) and importing

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int numberEntered = sc.nextInt();
        System.out.printf("You entered: %s %n", numberEntered);

        System.out.print("Enter a word: ");
        String firstWord = sc.next();
        System.out.printf("Your first word is: %s %n", firstWord);

        System.out.print("Enter another word: ");
        String secondWord = sc.next();
        System.out.printf("Your second word is: %s %n", secondWord);

        System.out.print("Enter one last word: ");
        String thirdWord = sc.next();
        System.out.printf("Your third word is: %s %n", thirdWord);

        System.out.print("Enter a sentence: ");
        sc.nextLine();
        String sentence = sc.nextLine();
        System.out.printf("You entered: %s %n", sentence);

        System.out.print("Enter the length of the classroom: ");
        int classroomLength = sc.nextInt();
        System.out.print("Enter the width of the classroom: ");
        int classroomWidth = sc.nextInt();
        System.out.println("The area of the classroom is: " + (classroomLength * classroomWidth));
        System.out.println("The perimeter of the classroom is: " + ((2 * classroomLength) + (2 * classroomWidth)));

        System.out.print("Enter the length of the classroom to the nearest tenth decimal: ");
        double lengthDecimal = sc.nextDouble();
        System.out.print("Enter the width of the classroom to the nearest tenth decimal: ");
        double widthDecimal = sc.nextDouble();
        double preciseArea = (lengthDecimal * widthDecimal);
        System.out.printf("The more precise area of the classroom is: %s %n", preciseArea);
        double volumeDecimal = (Math.pow(preciseArea, 3));
        System.out.printf("The volume of the classroom is: %s %n", volumeDecimal);

//        BONUS 1
//        Prompt the user to enter a favorite quote
//        Output the quote
//        Ask them to enter how many words are in the quote
//        Output the number they entered

        System.out.print("Enter your favorite quote: ");
        sc.nextLine();
        String favQuote = sc.nextLine();
        System.out.printf("Your favorite quote is: %s %n", favQuote);
        System.out.print("Enter the number of words in the quote: ");
        int numberOfWords = sc.nextInt();
        System.out.printf("The number of words in your favorite quote are: %s %n", numberOfWords);

//        BONUS 2
//        Prompt the user to enter a list of top three favorite foods separated by only spaces
//        Use the printf() to output there three top foods with the format:
//        1) FirstFood
//        2) SecondFood
//        3) ThirdFood

        System.out.print("Enter your favorite food: ");
        sc.nextLine();
        String firstFood = sc.nextLine();
        System.out.print("Enter your second favorite food: ");
        String secondFood = sc.nextLine();
        System.out.print("Enter your third favorite food: ");
        String thirdFood = sc.nextLine();
        System.out.printf("1) %s %n2) %s %n3) %s %n", firstFood, secondFood, thirdFood);

//        BONUS 3
//        Prompt the user to enter a grocery list of three items
//        Each item should only be separated by a comma (no spaces)
//        You will need to use the .useDelimiter() method on your scanner object
//        Output the result as a comma-separated list using printf()

        System.out.print("Enter three items to your grocery list: ");
        sc.useDelimiter("\\,");
        String firstItem = sc.next();
        String secondItem = sc.next();
        String thirdItem = sc.next();
        System.out.printf("Your grocery items list is: %n %s %n %s %n %s %n", firstItem, secondItem,thirdItem);

///////////////////////////////////////////////        NOTES

////        %n will create a new line, as well as \n

////        println
//        System.out.println("Hello");
//        System.out.println("World");

////        print
//        System.out.print("Hello");
//        System.out.print("World\n");
//        System.out.print("Hello ");
//        System.out.print("World");

////        printf
//        String name = "Tylor";
//        String lastName = "Pelletier";
//        String greeting = "Hello";
//        String punctuation = "!";
////        Without printf
//        System.out.println(greeting + " " + name + " " + lastName + punctuation);
////        Using printf
//        System.out.printf("%s %s %s%s", greeting, name, lastName, punctuation);

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Welcome");
//        System.out.println("Please enter your name:");
//        String userName = sc.next();
//        System.out.println("Well hello," + " " + userName);
//        System.out.printf("Well hello, %s %n", userName);
//        System.out.println("How old are you?");
//        int age = sc.nextInt();
//        System.out.println("You are" + " " + age + " " + "years old");
//        System.out.printf("You are %s years old %n", age);
//        System.out.printf("You were %s last year %n", (age - 1));
////        There is an issue with stacking some .next and .nextLine. Add an empty one to fix this problem
//        sc.nextLine();
//        System.out.println("What is your favorite Harry Potter movie?");
//        String favMovie = sc.nextLine();
//        System.out.printf("%s is my favorite too!", favMovie);

    }

}
