import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        // 1
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%s ", i);
//            i += 1;
//        }
//
//        System.out.println(" ");
//
//        int j = 0;
//        do {
//            System.out.printf("%s ", j);
//            j += 2;
//        } while (j <= 100);
//
//        System.out.println(" ");
//
//        int x = 100;
//        do {
//            System.out.printf("%s ", x);
//            x -= 5;
//        } while (x >= -10);
//
//        System.out.println(" ");
//
//        long y = 2;
//        do {
//            System.out.printf("%s ", y);
//            y *= y;
//        } while (y <= 1000000);
//
//        System.out.println(" ");
//
//        for (i = 5; i <= 15; i +=1) {
//            System.out.printf("%s ", i);
//        }
//
//        System.out.println(" ");
//
//        for (j = 0; j <=100; j += 2) {
//            System.out.printf("%s ", j);
//        }
//
//        System.out.println(" ");
//
//        for (x = 100; x >= -10; x -= 5) {
//            System.out.printf("%s ", x);
//        }
//
//        System.out.println(" ");
//
//        for (y = 2; y <= 1000000; y *= y) {
//            System.out.printf("%s ", y);
//        }
//
//        // 2
//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print("FizzBuzz ");
//            } else if (i % 3 == 0) {
//                System.out.print("Fizz ");
//            } else if (i % 5 == 0) {
//                System.out.print("Buzz ");
//            } else {
//                System.out.printf("%s ", i);
//            }
//        }
//
//        // 3
//
//        System.out.print("Enter a a number to stop at: ");
//        int numberToStopAt = sc.nextInt();
//        System.out.print(
//                "number | squared | cubed \n" +
//                "------ | ------- | ----- \n");
//
//        for (int j = 1; j <= numberToStopAt; j += 1) {
//            System.out.print(j + "      | " + (j * j) + "       | " + (j * j * j) + "\n");
//        }
//
        // 4
        int j = 0;
        for (int i = 0; i <= j;i += 1) {
            System.out.print("Enter a grade number between 0 and 100: ");
            int grade = sc.nextInt();
            if (grade <= 100 && grade >= 97) {
                System.out.println("A+");
            } else if (grade <= 96 && grade >= 93) {
                System.out.println("A");
            } else if (grade <= 92 && grade >= 90) {
                System.out.println("A-");
            } else if (grade <= 89 && grade >= 87) {
                System.out.println("B+");
            } else if (grade <= 86 && grade >= 83) {
                System.out.println("B");
            } else if (grade <= 82 && grade >= 80) {
                System.out.println("B-");
            } else if (grade <= 79 && grade >= 77) {
                System.out.println("C+");
            } else if (grade <= 76 && grade >= 73) {
                System.out.println("C");
            } else if (grade <= 72 && grade >= 70) {
                System.out.println("C-");
            } else if (grade <= 69 && grade >= 67) {
                System.out.println("D+");
            } else if (grade <= 66 && grade >= 63) {
                System.out.println("D");
            } else if (grade <= 62 && grade >= 60) {
                System.out.println("D-");
            } else if (grade <= 59 && grade >= 0) {
                System.out.println("F");
            } else {
                System.out.println("That was not a number between 0 and 100");
            }

            System.out.print("Continue? [y/N] ");
            String userInput = sc.next();
            boolean confirmation = userInput.equals("y");

            if (confirmation) {
                j += 1;
            } else {
                System.out.print(
                        "A+: 100-97\n" +
                        "A :  96-93\n" +
                        "A-:  92-90\n" +
                        "B+:  89-97\n" +
                        "B :  86-83\n" +
                        "B-:  82-80\n" +
                        "C+:  70-77\n" +
                        "C :  76-73\n" +
                        "C-:  72-70\n" +
                        "D+:  60-67\n" +
                        "D :  66-63\n" +
                        "D-:  62-60\n" +
                        "F :  59- 0");
            }

        }

    }

}